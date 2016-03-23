package com.borrow.dao.mapper;

import com.borrow.entity.RoleInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface RoleInfoMapper extends BaseMapper<RoleInfo,Integer>{
    @Delete({
        "delete from role",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into role (id, role_name, ",
        "permission_id, create_time, ",
        "update_time)",
        "values (#{id,jdbcType=INTEGER}, #{roleName,jdbcType=VARCHAR}, ",
        "#{permissionId,jdbcType=INTEGER}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(RoleInfo record);

    int insertSelective(RoleInfo record);

    @Select({
        "select",
        "id, role_name, permission_id, create_time, update_time",
        "from role",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    RoleInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RoleInfo record);

    @Update({
        "update role",
        "set role_name = #{roleName,jdbcType=VARCHAR},",
          "permission_id = #{permissionId,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(RoleInfo record);
}