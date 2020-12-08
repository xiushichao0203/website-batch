package com.website.batch.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.website.batch.entity.WeiboUser;
import com.website.batch.entity.WeiboUserNewsWithBLOBs;
import com.website.batch.mapper.WeiboUserNewsMapper;
import com.website.batch.service.WeiboService;
import com.website.batch.util.DateTimeUtil;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;


@Service
public class WeiboSeriveImpl implements WeiboService {

    @Resource
    private WeiboUserNewsMapper weiboUserNewsMapper;


    @Override
    public Map<String,Object> getUserWeiboNews(String weiboId) {
        String httpUrl = "https://m.weibo.cn/profile/info?uid=weiboId"
                .replace("weiboId", weiboId);
        try {

            CloseableHttpClient closeableHttpClient = HttpClients.createDefault();
            HttpPost httpPost = new HttpPost(httpUrl);
            httpPost.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.101 Safari/537.36");

            List<NameValuePair> list = new ArrayList<NameValuePair>();

            httpPost.setEntity(new UrlEncodedFormEntity(list));
            CloseableHttpResponse response = closeableHttpClient.execute(httpPost);
            HttpEntity entity = response.getEntity();
            String ux = EntityUtils.toString(entity, "utf-8");
            JSONObject jsonObject = JSON.parseObject(ux);

            if (Objects.isNull(jsonObject)) {
                Thread.sleep((long) (Math.random() * 30000));
                return getUserWeiboNews(weiboId);
            } else {
                Map<String,Object> weiboContentMap = new HashMap<>(2);
                JSONObject userObject = jsonObject.getJSONObject("data").getJSONObject("user");
                JSONArray comments = jsonObject.getJSONObject("data").getJSONArray("statuses");
                weiboContentMap.put("userInfo",textToWeiboUserWithJSONObject(userObject));
                weiboContentMap.put("contentList",textToWeiboContentListWithJSONObject(comments, weiboId));
                return weiboContentMap;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private List<WeiboUserNewsWithBLOBs> textToWeiboContentListWithJSONObject(JSONArray jsonArray, String weiboId) {
        List<WeiboUserNewsWithBLOBs> list = new ArrayList<>();
        for (Object v : jsonArray) {
            WeiboUserNewsWithBLOBs wc = new WeiboUserNewsWithBLOBs();
            JSONObject object = (JSONObject) v;
            wc.setId(object.getString("id"));
            wc.setMid(object.getString("mid"));
            wc.setWeiboId(weiboId);
            wc.setText(object.getString("text"));
            wc.setCreatedAt(object.getString("created_at"));
            JSONArray picArray = object.getJSONArray("pics");
            StringBuilder picSb = new StringBuilder();
            if (picArray != null) {
                for (Object pic : picArray) {
                    JSONObject picObj = (JSONObject) pic;
                    picSb.append(picObj.getString("url"));
                    picSb.append(";");
                }
                wc.setPics(picSb.toString());
            }
            wc.setSendFlag("0");
            wc.setCreateTime(DateTimeUtil.timeNow());
            list.add(wc);
        }
        return list;
    }

    private WeiboUser textToWeiboUserWithJSONObject(JSONObject jsonObject) {
        WeiboUser weiboUser = new WeiboUser();
        weiboUser.setAvatarHd(jsonObject.getString("avatar_hd"));
        weiboUser.setDescription(jsonObject.getString("description"));
        weiboUser.setNickName(jsonObject.getString("screen_name"));
        return weiboUser;
    }


    @Override
    public void insetUserWeiboContent(List<Map<String, Object>> userContentList) {

    }

    @Override
    public void sendEmailToSweetDog(String dogMail) {

    }
}
