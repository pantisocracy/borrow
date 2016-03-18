package com.borrow.dao.mapper;

import com.borrow.entity.UserInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserInfoMapper extends BaseMapper<UserInfo,Integer>{
    @Delete({
        "delete from users",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into users (id, user_name, ",
        "sex, age, mobile, ",
        "school_id, identity, ",
        "apply_account, add_time, ",
        "update_time, type)",
        "values (#{id,jdbcType=INTEGER}, #{userName,jdbcType=VARCHAR}, ",
        "#{sex,jdbcType=INTEGER}, #{age,jdbcType=INTEGER}, #{mobile,jdbcType=VARCHAR}, ",
        "#{schoolId,jdbcType=INTEGER}, #{identity,jdbcType=VARCHAR}, ",
        "#{applyAccount,jdbcType=INTEGER}, #{addTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{type,jdbcType=INTEGER})"
    })
    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    @Select({
        "select",
        "id, user_name, sex, age, mobile, school_id, identity, apply_account, add_time, ",
        "update_time, type",
        "from users",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    UserInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserInfo record);

    @Update({
        "update users",
        "set user_name = #{userName,jdbcType=VARCHAR},",
          "sex = #{sex,jdbcType=INTEGER},",
          "age = #{age,jdbcType=INTEGER},",
          "mobile = #{mobile,jdbcType=VARCHAR},",
          "school_id = #{schoolId,jdbcType=INTEGER},",
          "identity = #{identity,jdbcType=VARCHAR},",
          "apply_account = #{applyAccount,jdbcType=INTEGER},",
          "add_time = #{addTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "type = #{type,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UserInfo record);
}