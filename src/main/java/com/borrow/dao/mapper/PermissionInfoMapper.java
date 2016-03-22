package com.borrow.dao.mapper;

import com.borrow.entity.PermissionInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface PermissionInfoMapper extends BaseMapper<PermissionInfo,Integer>{
    @Delete({
        "delete from permission",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into permission (id, permission_name, ",
        "create_time, update_time)",
        "values (#{id,jdbcType=INTEGER}, #{permissionName,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(PermissionInfo record);

    int insertSelective(PermissionInfo record);

    @Select({
        "select",
        "id, permission_name, create_time, update_time",
        "from permission",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    PermissionInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PermissionInfo record);

    @Update({
        "update permission",
        "set permission_name = #{permissionName,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(PermissionInfo record);
}