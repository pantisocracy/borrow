package com.borrow.entity;

public class StagesTypeInfo {
    private Integer id;

    private String stagName;

    private Float interest;

    public StagesTypeInfo(Integer id, String stagName, Float interest) {
        this.id = id;
        this.stagName = stagName;
        this.interest = interest;
    }

    public StagesTypeInfo() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStagName() {
        return stagName;
    }

    public void setStagName(String stagName) {
        this.stagName = stagName == null ? null : stagName.trim();
    }

    public Float getInterest() {
        return interest;
    }

    public void setInterest(Float interest) {
        this.interest = interest;
    }
}