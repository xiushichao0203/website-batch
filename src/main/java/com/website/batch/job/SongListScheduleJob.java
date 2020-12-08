package com.website.batch.job;

import com.website.batch.constants.Constants;
import com.website.batch.mapper.NetEaseSongDetailMapper;
import com.website.batch.mapper.NetEaseSongListMapper;
import com.website.batch.mapper.NetEaseSongListRelMapper;
import com.website.batch.service.NetEaseCrawlerService;
import com.website.batch.util.DateTimeUtil;
import com.website.batch.util.IdGenerator;
import com.website.batch.entity.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


public class SongListScheduleJob extends AbstractScheduleJob {


    @Resource
    private IdGenerator idGenerator;
    @Resource
    private NetEaseCrawlerService easeCrawlerService;
    @Resource
    private NetEaseSongDetailMapper netEaseSongDetailMapper;
    @Resource
    private NetEaseSongListMapper netEaseSongListMapper;
    @Resource
    private NetEaseSongListRelMapper netEaseSongListRelMapper;


    private static final Logger LOGGER = LoggerFactory.getLogger(SongListScheduleJob.class);

    public SongListScheduleJob() {
        this.setLOGGER(LOGGER);
    }

    @Override
    protected void scheduleJobProcess() {
        NetEaseSongListExample netEaseSongListExample = new NetEaseSongListExample();
        List<NetEaseSongList> songList = netEaseSongListMapper.selectByExampleSelective(netEaseSongListExample);
        if (songList != null && songList.size() != 0) {
            songList.forEach(netEaseSongList -> {
                String songListId = netEaseSongList.getListId();
                List<Map<String, Object>> mapList = easeCrawlerService.getNetEaseSongListInfo(songListId);
                if (mapList != null && mapList.size() != 0) {
                    LOGGER.info("歌单ID:{}获取歌曲数量：{}",songListId,mapList.size());
                    mapList.forEach(songListMap -> {
                        String songId = (String) songListMap.get("songId");
                        String songName = (String) songListMap.get("songName");


                        NetEaseSongListRelExample netEaseSongListRelExample = new NetEaseSongListRelExample();
                        NetEaseSongListRelExample.Criteria criteria = netEaseSongListRelExample.createCriteria();
                        criteria.andSongIdEqualTo(songId);
                        criteria.andSongListIdEqualTo(songListId);

                        NetEaseSongListRel netEaseSongListRel = netEaseSongListRelMapper.selectOneByExample(netEaseSongListRelExample);
                        if (netEaseSongListRel == null) {
                            LOGGER.info("歌曲ID【{}】,歌曲名称【{}】不存在，插入歌单列表",songId,songName);
                            netEaseSongListRel = new NetEaseSongListRel();
                            netEaseSongListRel.setId(idGenerator.nextIdStr());
                            netEaseSongListRel.setSongListId(songListId);
                            netEaseSongListRel.setSongId(songId);
                            netEaseSongListRel.setSendFlag(Constants.YES_OR_NO_0);
                            netEaseSongListRel.setCreateTime(DateTimeUtil.timeNow());

                            netEaseSongListRelMapper.insertSelective(netEaseSongListRel);

                            NetEaseSongDetail songDetail = new NetEaseSongDetail();
                            songDetail.setId(songId);
                            songDetail.setSongId(songId);
                            songDetail.setSongName(songName);
                            songDetail.setCreateTime(DateTimeUtil.timeNow());
                            if (netEaseSongDetailMapper.selectByPrimaryKey(songId) == null) {
                                netEaseSongDetailMapper.insertSelective(songDetail);
                            }

                        }
                    });
                }
            });
        }
    }
}
