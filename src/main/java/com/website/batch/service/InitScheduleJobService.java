package com.website.batch.service;


import com.website.batch.entity.JobEntity;
import com.website.batch.entity.JobEntityExample;
import com.website.batch.mapper.JobEntityMapper;
import org.quartz.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 初始化JOB服务
 */
@Service
public class InitScheduleJobService {

    @Resource
    private JobEntityMapper jobEntityMapper;


    //通过Id获取Job
    public JobEntity getJobEntityById(Integer id) {
        return jobEntityMapper.selectByPrimaryKey(id);
    }

    //从数据库中加载获取到所有Job
    public List<JobEntity> loadJobs() {
        return jobEntityMapper.selectByExampleSelective(new JobEntityExample());
    }

    //获取JobDataMap.(Job参数对象)
    public JobDataMap getJobDataMap(JobEntity job) {
        JobDataMap map = new JobDataMap();
        map.put("name", job.getName());
        map.put("jobGroup", job.getJobGroup());
        map.put("cronExpression", job.getJobCron());
        map.put("parameter", job.getParamerter());
        map.put("jobDescription", job.getDescription());
        map.put("vmParam", job.getVmParam());
        map.put("jarPath", job.getJarPath());
        map.put("status", job.getStatus());
        map.put("jobName", job.getJobName());
        return map;
    }

    //获取JobDetail,JobDetail是任务的定义,而Job是任务的执行逻辑,JobDetail里会引用一个Job Class来定义
    public JobDetail getJobDetail(JobKey jobKey, String description, JobDataMap map) {
        String jobName = "com.myself.crawler.batch.job.".concat((String)map.get("jobName"));
        Class clz;
        try {
             clz = Class.forName(jobName);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
            throw new RuntimeException("项目初始化失败!"+jobName+"不存在");
        }
        return JobBuilder.newJob(clz)
                .withIdentity(jobKey)
                .withDescription(description)
                .setJobData(map)
                .storeDurably()
                .build();
    }

    //获取Trigger (Job的触发器,执行规则)
    public Trigger getTrigger(JobEntity job) {
        return TriggerBuilder.newTrigger()
                .withIdentity(job.getName(), job.getJobGroup())
                .withSchedule(CronScheduleBuilder.cronSchedule(job.getJobCron()))
                .build();
    }

    //获取JobKey,包含Name和Group
    public JobKey getJobKey(JobEntity job) {
        return JobKey.jobKey(job.getName(), job.getJobGroup());
    }
}
