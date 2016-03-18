package com.borrow.entity;

public class SchoolInfo {
    private Integer id;

    private String schoolName;

    private Integer areaidId;

    private String addTime;

    private String code;

    public SchoolInfo(Integer id, String schoolName, Integer areaidId, String addTime, String code) {
        this.id = id;
        this.schoolName = schoolName;
        this.areaidId = areaidId;
        this.addTime = addTime;
        this.code = code;
    }

    public SchoolInfo() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName == null ? null : schoolName.trim();
    }

    public Integer getAreaidId() {
        return areaidId;
    }

    public void setAreaidId(Integer areaidId) {
        this.areaidId = areaidId;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime == null ? null : addTime.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }
}