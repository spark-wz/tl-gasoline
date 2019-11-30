package com.unicorn.tlgasoline.entity;

import java.math.BigDecimal;

public class ShuiluSfy {
    private Long id;

    private Byte sfy;

    private Boolean type;

    private BigDecimal thisCumulative;

    private String startTime;

    private String time;

    private String liusu;

    private String midu;

    private String wendu;

    private String leiji;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Byte getSfy() {
        return sfy;
    }

    public void setSfy(Byte sfy) {
        this.sfy = sfy;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public BigDecimal getThisCumulative() {
        return thisCumulative;
    }

    public void setThisCumulative(BigDecimal thisCumulative) {
        this.thisCumulative = thisCumulative;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getLiusu() {
        return liusu;
    }

    public void setLiusu(String liusu) {
        this.liusu = liusu == null ? null : liusu.trim();
    }

    public String getMidu() {
        return midu;
    }

    public void setMidu(String midu) {
        this.midu = midu == null ? null : midu.trim();
    }

    public String getWendu() {
        return wendu;
    }

    public void setWendu(String wendu) {
        this.wendu = wendu == null ? null : wendu.trim();
    }

    public String getLeiji() {
        return leiji;
    }

    public void setLeiji(String leiji) {
        this.leiji = leiji == null ? null : leiji.trim();
    }
}