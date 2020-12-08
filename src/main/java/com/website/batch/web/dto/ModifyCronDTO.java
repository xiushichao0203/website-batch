package com.website.batch.web.dto;



public class ModifyCronDTO {

    private Integer id;


    private String cron;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron = cron;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ModifyCronDTO{");
        sb.append("id=").append(id);
        sb.append(", cron='").append(cron).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
