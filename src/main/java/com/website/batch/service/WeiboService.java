package com.website.batch.service;

import java.util.List;
import java.util.Map;


public interface WeiboService {

    Map<String,Object> getUserWeiboNews(String userId);

    void insetUserWeiboContent(List<Map<String, Object>> userContentList);

    void sendEmailToSweetDog(String dogMail);
}
