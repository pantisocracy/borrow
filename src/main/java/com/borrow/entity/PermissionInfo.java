package com.borrow.entity;

import java.util.Date;
import java.util.Set;

public class PermissionInfo {
    private Integer id;

    private String permissionName;

    private Date createTime;

    private Date updateTime;


    public PermissionInfo(Integer id, String permissionName, Date createTime, Date updateTime) {
        this.id = id;
        this.permissionName = permissionName;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}