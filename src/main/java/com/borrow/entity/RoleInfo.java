package com.borrow.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class RoleInfo {

    private Integer id;

    private String roleName;

    private Integer permissionId;

    private Date createTime;

    private Date updateTime;

    private List<PermissionInfo> permissions;

    public RoleInfo(Integer id, String roleName, Integer permissionId, Date createTime, Date updateTime, List<PermissionInfo> permissions) {
        this.id = id;
        this.roleName = roleName;
        this.permissionId = permissionId;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.permissions = permissions;
    }

    public List<PermissionInfo> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<PermissionInfo> permissions) {
        this.permissions = permissions;
    }

    public RoleInfo() {
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
    /**
     * 获取Shiro需要的permission string格式
     *
     * @return
     */
    public List<String> getStringPermissions() {
        if (permissions == null || permissions.size() <= 0) return null;
        List<String> permissionStrs = new ArrayList<String>();
        for (PermissionInfo permissionInfo : permissions) {
            permissionStrs.add(String.valueOf(permissionInfo.getId()));
        }
        return permissionStrs;
    }
}