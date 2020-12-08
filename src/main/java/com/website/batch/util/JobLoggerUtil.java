package com.website.batch.util;

import org.quartz.JobDataMap;
import org.slf4j.Logger;

public class JobLoggerUtil {

    public static void jobLoggerHelperBegin(Logger LOGGER, JobDataMap map){
        LOGGER.info("Running Job name : {} ", map.getString("name"));
        LOGGER.info("Running Job jobName : {} ", map.getString("jobName"));
        LOGGER.info("Running Job description : {}", map.getString("jobDescription"));
        LOGGER.info("Running Job group: {} ", map.getString("group"));
        LOGGER.info("Running Job cron : {}", map.getString("cronExpression"));
        LOGGER.info("Running Job jar path : {} ", map.getString("jarPath"));
        LOGGER.info("Running Job parameter : {} ", map.getString("parameter"));
        LOGGER.info("Running Job vmParam : {} ",  map.getString("vmParam"));
    }


    public static void jobLoggerHelperEnd(Logger LOGGER,Long startTime, Long endTime){
        LOGGER.info("Running Job has been completed , cost time : {}ms\n ", (endTime - startTime));
    }
}
