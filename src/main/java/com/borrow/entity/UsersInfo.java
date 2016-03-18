package com.borrow.entity;

import java.util.Date;

public class UsersInfo {
    private Integer id;

    private String userName;

    private Integer sex;

    private Integer age;

    private String mobile;

    private Integer schoolId;

    private String identity;

    private Integer applyAccount;

    private Date addTime;

    private Date updateTime;

    private Integer type;

    public UsersInfo(Integer id, String userName, Integer sex, Integer age, String mobile, Integer schoolId, String identity, Integer applyAccount, Date addTime, Date updateTime, Integer type) {
        this.id = id;
        this.userName = userName;
        this.sex = sex;
        this.age = age;
        this.mobile = mobile;
        this.schoolId = schoolId;
        this.identity = identity;
        this.applyAccount = applyAccount;
        this.addTime = addTime;
        this.updateTime = updateTime;
        this.type = type;
    }

    public UsersInfo() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity == null ? null : identity.trim();
    }

    public Integer getApplyAccount() {
        return applyAccount;
    }

    public void setApplyAccount(Integer applyAccount) {
        this.applyAccount = applyAccount;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}