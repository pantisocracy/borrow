package com.borrow.entity;

import java.util.Date;

public class Permission {
    private Integer id;

    private String permissionName;

    private Date createTime;

    private Date updateTime;

    public Permission(Integer id, String permissionName, Date createTime, Date updateTime) {
        this.id = id;
        this.permissionName = permissionName;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Permission() {
        super();
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
        this.permissionName = permissionName == null ? null : permissionName.trim();
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