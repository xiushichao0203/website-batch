package com.website.batch.entity;

import java.util.ArrayList;
import java.util.Arrays;

public class JobEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRTZ_JOB_ENTITY.ID
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRTZ_JOB_ENTITY.NAME
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRTZ_JOB_ENTITY.JOB_GROUP
     *
     * @mbg.generated
     */
    private String jobGroup;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRTZ_JOB_ENTITY.JOB_NAME
     *
     * @mbg.generated
     */
    private String jobName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRTZ_JOB_ENTITY.JOB_CRON
     *
     * @mbg.generated
     */
    private String jobCron;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRTZ_JOB_ENTITY.PARAMERTER
     *
     * @mbg.generated
     */
    private String paramerter;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRTZ_JOB_ENTITY.DESCRIPTION
     *
     * @mbg.generated
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRTZ_JOB_ENTITY.VM_PARAM
     *
     * @mbg.generated
     */
    private String vmParam;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRTZ_JOB_ENTITY.JAR_PATH
     *
     * @mbg.generated
     */
    private String jarPath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRTZ_JOB_ENTITY.STATUS
     *
     * @mbg.generated
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRTZ_JOB_ENTITY.CREATE_TIME
     *
     * @mbg.generated
     */
    private String createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRTZ_JOB_ENTITY.UPDATE_TIME
     *
     * @mbg.generated
     */
    private String updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRTZ_JOB_ENTITY.ID
     *
     * @return the value of QRTZ_JOB_ENTITY.ID
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRTZ_JOB_ENTITY.ID
     *
     * @param id the value for QRTZ_JOB_ENTITY.ID
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRTZ_JOB_ENTITY.NAME
     *
     * @return the value of QRTZ_JOB_ENTITY.NAME
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRTZ_JOB_ENTITY.NAME
     *
     * @param name the value for QRTZ_JOB_ENTITY.NAME
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRTZ_JOB_ENTITY.JOB_GROUP
     *
     * @return the value of QRTZ_JOB_ENTITY.JOB_GROUP
     *
     * @mbg.generated
     */
    public String getJobGroup() {
        return jobGroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRTZ_JOB_ENTITY.JOB_GROUP
     *
     * @param jobGroup the value for QRTZ_JOB_ENTITY.JOB_GROUP
     *
     * @mbg.generated
     */
    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRTZ_JOB_ENTITY.JOB_NAME
     *
     * @return the value of QRTZ_JOB_ENTITY.JOB_NAME
     *
     * @mbg.generated
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRTZ_JOB_ENTITY.JOB_NAME
     *
     * @param jobName the value for QRTZ_JOB_ENTITY.JOB_NAME
     *
     * @mbg.generated
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRTZ_JOB_ENTITY.JOB_CRON
     *
     * @return the value of QRTZ_JOB_ENTITY.JOB_CRON
     *
     * @mbg.generated
     */
    public String getJobCron() {
        return jobCron;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRTZ_JOB_ENTITY.JOB_CRON
     *
     * @param jobCron the value for QRTZ_JOB_ENTITY.JOB_CRON
     *
     * @mbg.generated
     */
    public void setJobCron(String jobCron) {
        this.jobCron = jobCron;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRTZ_JOB_ENTITY.PARAMERTER
     *
     * @return the value of QRTZ_JOB_ENTITY.PARAMERTER
     *
     * @mbg.generated
     */
    public String getParamerter() {
        return paramerter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRTZ_JOB_ENTITY.PARAMERTER
     *
     * @param paramerter the value for QRTZ_JOB_ENTITY.PARAMERTER
     *
     * @mbg.generated
     */
    public void setParamerter(String paramerter) {
        this.paramerter = paramerter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRTZ_JOB_ENTITY.DESCRIPTION
     *
     * @return the value of QRTZ_JOB_ENTITY.DESCRIPTION
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRTZ_JOB_ENTITY.DESCRIPTION
     *
     * @param description the value for QRTZ_JOB_ENTITY.DESCRIPTION
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRTZ_JOB_ENTITY.VM_PARAM
     *
     * @return the value of QRTZ_JOB_ENTITY.VM_PARAM
     *
     * @mbg.generated
     */
    public String getVmParam() {
        return vmParam;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRTZ_JOB_ENTITY.VM_PARAM
     *
     * @param vmParam the value for QRTZ_JOB_ENTITY.VM_PARAM
     *
     * @mbg.generated
     */
    public void setVmParam(String vmParam) {
        this.vmParam = vmParam;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRTZ_JOB_ENTITY.JAR_PATH
     *
     * @return the value of QRTZ_JOB_ENTITY.JAR_PATH
     *
     * @mbg.generated
     */
    public String getJarPath() {
        return jarPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRTZ_JOB_ENTITY.JAR_PATH
     *
     * @param jarPath the value for QRTZ_JOB_ENTITY.JAR_PATH
     *
     * @mbg.generated
     */
    public void setJarPath(String jarPath) {
        this.jarPath = jarPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRTZ_JOB_ENTITY.STATUS
     *
     * @return the value of QRTZ_JOB_ENTITY.STATUS
     *
     * @mbg.generated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRTZ_JOB_ENTITY.STATUS
     *
     * @param status the value for QRTZ_JOB_ENTITY.STATUS
     *
     * @mbg.generated
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRTZ_JOB_ENTITY.CREATE_TIME
     *
     * @return the value of QRTZ_JOB_ENTITY.CREATE_TIME
     *
     * @mbg.generated
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRTZ_JOB_ENTITY.CREATE_TIME
     *
     * @param createTime the value for QRTZ_JOB_ENTITY.CREATE_TIME
     *
     * @mbg.generated
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRTZ_JOB_ENTITY.UPDATE_TIME
     *
     * @return the value of QRTZ_JOB_ENTITY.UPDATE_TIME
     *
     * @mbg.generated
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRTZ_JOB_ENTITY.UPDATE_TIME
     *
     * @param updateTime the value for QRTZ_JOB_ENTITY.UPDATE_TIME
     *
     * @mbg.generated
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_JOB_ENTITY
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", jobGroup=").append(jobGroup);
        sb.append(", jobName=").append(jobName);
        sb.append(", jobCron=").append(jobCron);
        sb.append(", paramerter=").append(paramerter);
        sb.append(", description=").append(description);
        sb.append(", vmParam=").append(vmParam);
        sb.append(", jarPath=").append(jarPath);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_JOB_ENTITY
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        JobEntity other = (JobEntity) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getJobGroup() == null ? other.getJobGroup() == null : this.getJobGroup().equals(other.getJobGroup()))
            && (this.getJobName() == null ? other.getJobName() == null : this.getJobName().equals(other.getJobName()))
            && (this.getJobCron() == null ? other.getJobCron() == null : this.getJobCron().equals(other.getJobCron()))
            && (this.getParamerter() == null ? other.getParamerter() == null : this.getParamerter().equals(other.getParamerter()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getVmParam() == null ? other.getVmParam() == null : this.getVmParam().equals(other.getVmParam()))
            && (this.getJarPath() == null ? other.getJarPath() == null : this.getJarPath().equals(other.getJarPath()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_JOB_ENTITY
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getJobGroup() == null) ? 0 : getJobGroup().hashCode());
        result = prime * result + ((getJobName() == null) ? 0 : getJobName().hashCode());
        result = prime * result + ((getJobCron() == null) ? 0 : getJobCron().hashCode());
        result = prime * result + ((getParamerter() == null) ? 0 : getParamerter().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getVmParam() == null) ? 0 : getVmParam().hashCode());
        result = prime * result + ((getJarPath() == null) ? 0 : getJarPath().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table QRTZ_JOB_ENTITY
     *
     * @mbg.generated
     */
    public enum Column {
        id("ID", "id", "INTEGER", false),
        name("NAME", "name", "VARCHAR", true),
        jobGroup("JOB_GROUP", "jobGroup", "VARCHAR", false),
        jobName("JOB_NAME", "jobName", "VARCHAR", false),
        jobCron("JOB_CRON", "jobCron", "VARCHAR", false),
        paramerter("PARAMERTER", "paramerter", "VARCHAR", false),
        description("DESCRIPTION", "description", "VARCHAR", false),
        vmParam("VM_PARAM", "vmParam", "VARCHAR", false),
        jarPath("JAR_PATH", "jarPath", "VARCHAR", false),
        status("STATUS", "status", "VARCHAR", false),
        createTime("CREATE_TIME", "createTime", "VARCHAR", false),
        updateTime("UPDATE_TIME", "updateTime", "VARCHAR", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table QRTZ_JOB_ENTITY
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table QRTZ_JOB_ENTITY
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table QRTZ_JOB_ENTITY
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table QRTZ_JOB_ENTITY
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table QRTZ_JOB_ENTITY
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table QRTZ_JOB_ENTITY
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table QRTZ_JOB_ENTITY
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table QRTZ_JOB_ENTITY
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table QRTZ_JOB_ENTITY
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table QRTZ_JOB_ENTITY
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table QRTZ_JOB_ENTITY
         *
         * @mbg.generated
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table QRTZ_JOB_ENTITY
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table QRTZ_JOB_ENTITY
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table QRTZ_JOB_ENTITY
         *
         * @mbg.generated
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table QRTZ_JOB_ENTITY
         *
         * @mbg.generated
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table QRTZ_JOB_ENTITY
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}
