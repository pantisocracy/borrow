package com.borrow.dao.mapper;

import com.borrow.entity.RolePermissionInfo;
import org.apache.ibatis.annotations.Insert;

public interface RolePermissionInfoMapper extends BaseMapper<RolePermissionInfoMapper,Integer>{
    @Insert({
        "insert into role_permission (id, role_id, ",
        "permission_id)",
        "values (#{id,jdbcType=INTEGER}, #{roleId,jdbcType=INTEGER}, ",
        "#{permissionId,jdbcType=INTEGER})"
    })
    int insert(RolePermissionInfo record);

    int insertSelective(RolePermissionInfo record);
}