package com.website.batch.job;

import com.website.batch.constants.Constants;
import com.website.batch.mapper.WeiboSendListMapper;
import com.website.batch.mapper.WeiboUserMapper;
import com.website.batch.mapper.WeiboUserNewsMapper;
import com.website.batch.service.MailService;
import com.website.batch.util.DateTimeUtil;
import com.website.batch.entity.*;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;


public class WeiboNoticeMailScheduleJob extends AbstractScheduleJob {

    @Resource
    private MailService mailService;
    @Resource
    private WeiboUserNewsMapper weiboUserNewsMapper;
    @Resource
    private WeiboSendListMapper weiboSendListMapper;
    @Resource
    private WeiboUserMapper weiboUserMapper;

    private static final Logger LOGGER = LoggerFactory.getLogger(WeiboNoticeMailScheduleJob.class);

    public WeiboNoticeMailScheduleJob() {
        this.setLOGGER(LOGGER);
    }


    @Override
    protected void scheduleJobProcess() {


        WeiboUserNewsExample weiboUserNewsExample = new WeiboUserNewsExample();
        WeiboUserNewsExample.Criteria criteria = weiboUserNewsExample.createCriteria();
        criteria.andSendFlagEqualTo(Constants.YES_OR_NO_0);
        weiboUserNewsExample.setDistinct(true);

        List<WeiboUserNews> needSendList = weiboUserNewsMapper.selectByExample(weiboUserNewsExample);
        if(needSendList != null && needSendList.size() != 0){
            needSendList.forEach(needSendWeiboUser ->{
                WeiboUserNewsExample weiboUserNewsExample2 = new WeiboUserNewsExample();
                WeiboUserNewsExample.Criteria criteria2 = weiboUserNewsExample2.createCriteria();
                criteria2.andSendFlagEqualTo(Constants.YES_OR_NO_0);
                criteria2.andWeiboIdEqualTo(needSendWeiboUser.getWeiboId());
                weiboUserNewsExample2.setOrderByClause("id desc");
                List<WeiboUserNewsWithBLOBs> sendList = weiboUserNewsMapper.selectByExampleWithBLOBs(weiboUserNewsExample2);

                WeiboUserExample weiboUserExample = new WeiboUserExample();
                WeiboUserExample.Criteria weiboUserCriteria = weiboUserExample.createCriteria();
                weiboUserCriteria.andWeiboIdEqualTo(needSendWeiboUser.getWeiboId());

                WeiboUser weiboUser = weiboUserMapper.selectOneByExample(weiboUserExample);

                if (sendList != null && sendList.size() != 0) {
                    String subject = "【userName】刚刚更新了【num】条微博"
                            .replace("userName", weiboUser.getWeiboName())
                            .replace("num", String.valueOf(sendList.size()));
                    String content = ("<a href=\"https://weibo.com/u/userId\">点击此处查看更新详情</a>")
                            .replace("userId", weiboUser.getWeiboId());
                    StringBuilder contentSb = new StringBuilder();
                    contentSb.append("<h1>---------------------------------------------------------</h1>")
                            .append("<h1><img width='50' height='50' src='" + weiboUser.getAvatarHd() + "'>" + weiboUser.getNickName() + "</h1>")
                            .append("<h3>" + weiboUser.getDescription() + "</h3>")
                            .append("<h1>---------------------------------------------------------</h1>")
                            .append("<div>")
                            .append("<br><p>------------------------------------------------------------------------</p></br>");
                    sendList.forEach((wc) -> {
                        contentSb.append(wc.getText());
                        String pics = wc.getPics();
                        if (StringUtils.isNotEmpty(pics)) {
                            String[] picArr = pics.split(";");
                            for (int i = 0; i < picArr.length; i++) {
                                contentSb.append("</br><img src='")
                                        .append(picArr[i])
                                        .append("'>");
                            }
                        }
                        contentSb.append("<br><p align=\"right\">")
                                .append(wc.getCreatedAt())
                                .append("</br>")
                                .append("<br><p>------------------------------------------------------------------------</p></br>");
                    });
                    contentSb.append(content)
                            .append("<br><p>------------------------------------------------------------------------</p>")
                            .append("</div>");

                    WeiboSendListExample weiboSendListExample = new WeiboSendListExample();
                    WeiboSendListExample.Criteria criteria1 = weiboSendListExample.createCriteria();
                    criteria1.andWeiboIdEqualTo(weiboUser.getWeiboId());

                    List<WeiboSendList> sendUserList = weiboSendListMapper.selectByExample(weiboSendListExample);

                    if (sendUserList != null && sendUserList.size() != 0) {
                        sendUserList.forEach((su) -> {
                            if(Constants.YES_OR_NO_1.equals(su.getSendSwitch())){
                                mailService.sendMime(su.getUserId(),su.getUserMail(), subject, contentSb.toString(), null, false);
                            }
                        });

                        LOGGER.info("执行动态定时任务: 邮件发送完毕");

                        sendList.forEach((wc) -> {
                            wc.setSendFlag(Constants.YES_OR_NO_1);
                            wc.setUpdateTime(DateTimeUtil.timeNow());
                            weiboUserNewsMapper.updateByPrimaryKeySelective(wc);
                        });

                    }
                    LOGGER.info("执行动态定时任务: 微博状态更新完毕");
                }


            });
        }
    }

}
