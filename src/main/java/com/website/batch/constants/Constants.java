package com.website.batch.constants;


public interface Constants {
    String YES_OR_NO_0 = "0";
    String YES_OR_NO_1= "1";
    //歌单url
     String SOURCE_URL = "http://music.163.com/discover/playlist/?";

     String FAVORATE_SONG_LIST_URL = "https://music.163.com/playlist?id=";

    //163主域名
     String DOMAIN = "http://music.163.com";
     String BASE_URL = "http://music.163.com/";

    //获取评论的API路径(没被加密)
     String NET_EASE_COMMENT_API_URL_NO_ENCRYPT = "http://music.163.com/api/v1/resource/comments/R_SO_4_songId?limit=limits&offset=offsets";

    //获取评论的API路径(被加密)
     String NET_EASE_COMMENT_API_URL_ENCRYPT = "http://music.163.com/weapi/v1/resource/comments/R_SO_4_";

     String NET_EASE_ENCRYPT_KEY = "0CoJUm6Qyw8W8jud";

    //解密用的文本
     String TEXT = "{\"username\": \"\", \"rememberLogin\": \"true\", \"password\": \"\"}";

    //存储歌曲信息文本路径
     String COMMENT_MESSAGE_PATH = "/home/user/workspace/NetEaseMusicCrawler/log/comment_message.xls";

    //存储评论内容文本路径
     String COMMENTS_PATH = "/home/user/workspace/NetEaseMusicCrawler/log/comments_";

     String COMMENTS_SUFFIX = ".xls";

    //TOP歌曲文本路径
     String TOP_MUSIC_PATH = "/home/user/workspace/NetEaseMusicCrawler/log/top_music.xls";

    //歌曲评论大于某个值文本路径
     String TOP_COMMENT_MORE_MUSIC_PATH = "/home/user/workspace/NetEaseMusicCrawler/log/music_comment_gt.xls";

    //要爬取的歌单数
     int MUSIC_LIST_COUNT = 100;

    //分页数
     int PER_PAGE = 100;

    //偏移量
     int OFFSET = 0;

    //要爬取的TOP歌曲数
     int TOP_MUSIC_COUNT = 20;

    //获取评论数大于该值的歌曲
     int COMMENTS_LIMIT = 100000;

     String HER = "";

}
