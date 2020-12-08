package com.website.batch.job;

import com.website.batch.constants.Constants;
import com.website.batch.entity.NetEaseSongDetail;
import com.website.batch.entity.NetEaseSongList;
import com.website.batch.entity.NetEaseSongListRel;
import com.website.batch.entity.NetEaseSongListRelExample;
import com.website.batch.mapper.NetEaseSongDetailMapper;
import com.website.batch.mapper.NetEaseSongListMapper;
import com.website.batch.mapper.NetEaseSongListRelMapper;
import com.website.batch.service.MailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;


public class SongNoticeMailScheduleJob extends AbstractScheduleJob {


    @Resource
    private MailService mailService;

    @Resource
    private NetEaseSongListMapper netEaseSongListMapper;
    @Resource
    private NetEaseSongDetailMapper netEaseSongDetailMapper;
    @Resource
    private NetEaseSongListRelMapper netEaseSongListRelMapper;


    private static final Logger LOGGER = LoggerFactory.getLogger(SongNoticeMailScheduleJob.class);


    public SongNoticeMailScheduleJob() {
        this.setLOGGER(LOGGER);
    }


    @Override
    protected void scheduleJobProcess() {

        NetEaseSongListRelExample netEaseSongListRelExample = new NetEaseSongListRelExample();
        NetEaseSongListRelExample.Criteria criteria = netEaseSongListRelExample.createCriteria();
        criteria.andSendFlagEqualTo(Constants.YES_OR_NO_0);
        netEaseSongListRelExample.setDistinct(true);

        List<NetEaseSongListRel> list = netEaseSongListRelMapper.selectByExampleSelective(netEaseSongListRelExample, NetEaseSongListRel.Column.songListId);

        if(list != null && list.size() != 0){

            list.forEach(netEaseSongListRel -> {
                String songListId = netEaseSongListRel.getSongListId();
                NetEaseSongListRelExample netEaseSongListRelExample2 = new NetEaseSongListRelExample();
                NetEaseSongListRelExample.Criteria criteria2 = netEaseSongListRelExample2.createCriteria();
                criteria2.andSongListIdEqualTo(songListId);
                criteria2.andSendFlagEqualTo(Constants.YES_OR_NO_0);

                List<NetEaseSongListRel> sendSongList = netEaseSongListRelMapper.selectByExample(netEaseSongListRelExample2);

                NetEaseSongList netEaseSongList = netEaseSongListMapper.selectByPrimaryKey(songListId);

                String songListName = netEaseSongList.getListName();

                String subject = "歌单【songListName】更新了【num】首歌曲"
                        .replace("songListName",songListName)
                        .replace("num",String.valueOf(sendSongList.size()));

                StringBuilder contentSb = new StringBuilder();

                sendSongList.forEach(netEaseSongListRel1 -> {
                    contentSb.append("<br>");
                    String songId = netEaseSongListRel1.getSongId();
                    contentSb.append("歌曲ID:");
                    contentSb.append(songId);
                    contentSb.append("  |  ");
                    contentSb.append("歌曲名称:");
                    NetEaseSongDetail netEaseSongDetail = netEaseSongDetailMapper.selectByPrimaryKey(songId);

                    NetEaseSongListRelExample netEaseSongListRelExample3 = new NetEaseSongListRelExample();
                    NetEaseSongListRelExample.Criteria criteria3 = netEaseSongListRelExample3.createCriteria();
                    criteria3.andSongIdEqualTo(songId);
                    criteria3.andSongListIdNotEqualTo(songListId);

                    List<NetEaseSongListRel> otherList = netEaseSongListRelMapper.selectByExample(netEaseSongListRelExample3);


                    if(netEaseSongDetail != null){
                        contentSb.append(netEaseSongDetail.getSongName());
                    }else{
                        contentSb.append("暂无");
                    }
                    if(otherList != null && otherList.size() != 0){
                        contentSb.append("  PS：也是ta喜欢的歌曲哦");
                    }
                    contentSb.append("</br>");
                });

                mailService.sendMime("super0","1270052467@qq.com", subject, contentSb.toString(), null, false);


                NetEaseSongListRel netEaseSongListRel1 = new NetEaseSongListRel();
                netEaseSongListRel1.setSendFlag(Constants.YES_OR_NO_1);
                netEaseSongListRelMapper.updateByExampleSelective(netEaseSongListRel1,netEaseSongListRelExample2);

            });
        }
    }
}
