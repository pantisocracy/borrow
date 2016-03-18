package com.borrow.entity;

import java.util.Date;

public class ApplyInfo {
    private Integer id;

    private Integer userId;

    private Integer courseId;

    private Integer state;

    private Date addTime;

    private Date passTime;

    private Integer disposeId;

    private Integer providerId;

    public ApplyInfo(Integer id, Integer userId, Integer courseId, Integer state, Date addTime, Date passTime, Integer disposeId, Integer providerId) {
        this.id = id;
        this.userId = userId;
        this.courseId = courseId;
        this.state = state;
        this.addTime = addTime;
        this.passTime = passTime;
        this.disposeId = disposeId;
        this.providerId = providerId;
    }

    public ApplyInfo() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getPassTime() {
        return passTime;
    }

    public void setPassTime(Date passTime) {
        this.passTime = passTime;
    }

    public Integer getDisposeId() {
        return disposeId;
    }

    public void setDisposeId(Integer disposeId) {
        this.disposeId = disposeId;
    }

    public Integer getProviderId() {
        return providerId;
    }

    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }
}