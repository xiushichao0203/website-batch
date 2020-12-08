package com.website.batch.job;

import com.website.batch.util.JobLoggerUtil;
import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;


public abstract class AbstractScheduleJob implements Job {


    private Logger LOGGER;

    protected void setLOGGER(Logger LOGGER) {
        if(LOGGER != null){
            this.LOGGER = LOGGER;
        }
    }

    /**
     * 核心方法,Quartz Job真正的执行逻辑.
     *
     * @param jobExecutionContext executorContext JobExecutionContext中封装有Quartz运行所需要的所有信息
     * @throws JobExecutionException execute()方法只允许抛出JobExecutionException异常
     */
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        //JobDetail中的JobDataMap是共用的,从getMergedJobDataMap获取的JobDataMap是全新的对象
        JobDataMap map = jobExecutionContext.getMergedJobDataMap();
        JobLoggerUtil.jobLoggerHelperBegin(LOGGER,map);
        long startTime = System.currentTimeMillis();
        // 执行JOB
        scheduleJobProcess();
        long endTime = System.currentTimeMillis();
        JobLoggerUtil.jobLoggerHelperEnd(LOGGER,startTime,endTime);
    }


    protected void scheduleJobProcess(){

    }
}
