package com.website.batch.entity;

import java.util.ArrayList;
import java.util.Arrays;

public class WeiboUserNewsWithBLOBs extends WeiboUserNews {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WEIBO_USER_NEWS.TEXT
     *
     * @mbg.generated
     */
    private String text;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WEIBO_USER_NEWS.PICS
     *
     * @mbg.generated
     */
    private String pics;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WEIBO_USER_NEWS.TEXT
     *
     * @return the value of WEIBO_USER_NEWS.TEXT
     *
     * @mbg.generated
     */
    public String getText() {
        return text;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WEIBO_USER_NEWS.TEXT
     *
     * @param text the value for WEIBO_USER_NEWS.TEXT
     *
     * @mbg.generated
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WEIBO_USER_NEWS.PICS
     *
     * @return the value of WEIBO_USER_NEWS.PICS
     *
     * @mbg.generated
     */
    public String getPics() {
        return pics;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WEIBO_USER_NEWS.PICS
     *
     * @param pics the value for WEIBO_USER_NEWS.PICS
     *
     * @mbg.generated
     */
    public void setPics(String pics) {
        this.pics = pics;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WEIBO_USER_NEWS
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", text=").append(text);
        sb.append(", pics=").append(pics);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WEIBO_USER_NEWS
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
        WeiboUserNewsWithBLOBs other = (WeiboUserNewsWithBLOBs) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMid() == null ? other.getMid() == null : this.getMid().equals(other.getMid()))
            && (this.getWeiboId() == null ? other.getWeiboId() == null : this.getWeiboId().equals(other.getWeiboId()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()))
            && (this.getSendFlag() == null ? other.getSendFlag() == null : this.getSendFlag().equals(other.getSendFlag()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getText() == null ? other.getText() == null : this.getText().equals(other.getText()))
            && (this.getPics() == null ? other.getPics() == null : this.getPics().equals(other.getPics()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WEIBO_USER_NEWS
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMid() == null) ? 0 : getMid().hashCode());
        result = prime * result + ((getWeiboId() == null) ? 0 : getWeiboId().hashCode());
        result = prime * result + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        result = prime * result + ((getSendFlag() == null) ? 0 : getSendFlag().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getText() == null) ? 0 : getText().hashCode());
        result = prime * result + ((getPics() == null) ? 0 : getPics().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table WEIBO_USER_NEWS
     *
     * @mbg.generated
     */
    public enum Column {
        id("ID", "id", "VARCHAR", false),
        mid("MID", "mid", "VARCHAR", false),
        weiboId("WEIBO_ID", "weiboId", "VARCHAR", false),
        createdAt("CREATED_AT", "createdAt", "VARCHAR", false),
        sendFlag("SEND_FLAG", "sendFlag", "VARCHAR", false),
        createTime("CREATE_TIME", "createTime", "VARCHAR", false),
        updateTime("UPDATE_TIME", "updateTime", "VARCHAR", false),
        text("TEXT", "text", "LONGVARCHAR", true),
        pics("PICS", "pics", "LONGVARCHAR", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table WEIBO_USER_NEWS
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table WEIBO_USER_NEWS
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table WEIBO_USER_NEWS
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table WEIBO_USER_NEWS
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table WEIBO_USER_NEWS
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table WEIBO_USER_NEWS
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table WEIBO_USER_NEWS
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table WEIBO_USER_NEWS
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table WEIBO_USER_NEWS
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table WEIBO_USER_NEWS
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table WEIBO_USER_NEWS
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
         * This method corresponds to the database table WEIBO_USER_NEWS
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table WEIBO_USER_NEWS
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table WEIBO_USER_NEWS
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
         * This method corresponds to the database table WEIBO_USER_NEWS
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
         * This method corresponds to the database table WEIBO_USER_NEWS
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}