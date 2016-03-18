package com.borrow.entity;

import java.util.Date;

public class CourseInfo {
    private Integer id;

    private String courseName;

    private Date addTime;

    private Integer stagesTypeId;

    private Integer schoolId;

    private String coverImg;

    private Float price;

    private String content;

    public CourseInfo(Integer id, String courseName, Date addTime, Integer stagesTypeId, Integer schoolId, String coverImg, Float price, String content) {
        this.id = id;
        this.courseName = courseName;
        this.addTime = addTime;
        this.stagesTypeId = stagesTypeId;
        this.schoolId = schoolId;
        this.coverImg = coverImg;
        this.price = price;
        this.content = content;
    }

    public CourseInfo() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Integer getStagesTypeId() {
        return stagesTypeId;
    }

    public void setStagesTypeId(Integer stagesTypeId) {
        this.stagesTypeId = stagesTypeId;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public String getCoverImg() {
        return coverImg;
    }

    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg == null ? null : coverImg.trim();
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}