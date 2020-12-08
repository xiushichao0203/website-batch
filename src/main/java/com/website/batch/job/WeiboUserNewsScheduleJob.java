package com.website.batch.job;

import com.website.batch.entity.WeiboUser;
import com.website.batch.entity.WeiboUserExample;
import com.website.batch.entity.WeiboUserNewsWithBLOBs;
import com.website.batch.mapper.WeiboUserMapper;
import com.website.batch.mapper.WeiboUserNewsMapper;
import com.website.batch.service.WeiboService;
import org.quartz.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


@DisallowConcurrentExecution
@Component
public class WeiboUserNewsScheduleJob extends AbstractScheduleJob {


    @Resource
    private WeiboService weiboService;
    @Resource
    private WeiboUserMapper weiboUserMapper;
    @Resource
    private WeiboUserNewsMapper weiboUserNewsMapper;


    private static final Logger LOGGER = LoggerFactory.getLogger(WeiboUserNewsScheduleJob.class);

    public WeiboUserNewsScheduleJob() {
        this.setLOGGER(LOGGER);
    }

    @Override
    public void scheduleJobProcess(){
        WeiboUserExample weiboUserexample = new WeiboUserExample();
        List<WeiboUser> weiboUserList = weiboUserMapper.selectByExample(weiboUserexample);
        if (weiboUserList != null && weiboUserList.size() != 0) {
            weiboUserList.forEach((wu) -> {
                String weiboId = wu.getWeiboId();
                //1.0 查询内容
                Map<String, Object> weiboContentMap = weiboService.getUserWeiboNews(weiboId);
                WeiboUser weiboUser = (WeiboUser) weiboContentMap.get("userInfo");
                wu.setAvatarHd(weiboUser.getAvatarHd());
                wu.setNickName(weiboUser.getNickName());
                wu.setDescription(weiboUser.getDescription());
                weiboUserMapper.updateByPrimaryKey(wu);

                List<WeiboUserNewsWithBLOBs> list = (List<WeiboUserNewsWithBLOBs>) weiboContentMap.get("contentList");
                if (list.size() != 0) {
                    list.forEach((wc) -> {
                        if (weiboUserNewsMapper.selectByPrimaryKey(wc.getId()) == null) {
                            weiboUserNewsMapper.insertSelective(wc);
                        }
                    });
                    LOGGER.info("执行动态定时任务: 微博内容更新完毕");
                }
            });
        }
    }

}
