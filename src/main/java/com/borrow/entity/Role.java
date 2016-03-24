package com.borrow.entity;

import java.util.Date;

public class Role {
    private Integer id;

    private String roleName;

    private Integer permissionId;

    private Date createTime;

    private Date updateTime;

    public Role(Integer id, String roleName, Integer permissionId, Date createTime, Date updateTime) {
        this.id = id;
        this.roleName = roleName;
        this.permissionId = permissionId;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Role() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
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