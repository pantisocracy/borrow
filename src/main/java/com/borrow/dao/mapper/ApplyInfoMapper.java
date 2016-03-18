package com.borrow.dao.mapper;

import com.borrow.entity.ApplyInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ApplyInfoMapper {
    @Delete({
        "delete from apply",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into apply (id, user_id, ",
        "course_id, state, ",
        "add_time, pass_time, ",
        "dispose_id, provider_id)",
        "values (#{id,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{courseId,jdbcType=INTEGER}, #{state,jdbcType=INTEGER}, ",
        "#{addTime,jdbcType=TIMESTAMP}, #{passTime,jdbcType=TIMESTAMP}, ",
        "#{disposeId,jdbcType=INTEGER}, #{providerId,jdbcType=INTEGER})"
    })
    int insert(ApplyInfo record);

    int insertSelective(ApplyInfo record);

    @Select({
        "select",
        "id, user_id, course_id, state, add_time, pass_time, dispose_id, provider_id",
        "from apply",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    ApplyInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ApplyInfo record);

    @Update({
        "update apply",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "course_id = #{courseId,jdbcType=INTEGER},",
          "state = #{state,jdbcType=INTEGER},",
          "add_time = #{addTime,jdbcType=TIMESTAMP},",
          "pass_time = #{passTime,jdbcType=TIMESTAMP},",
          "dispose_id = #{disposeId,jdbcType=INTEGER},",
          "provider_id = #{providerId,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ApplyInfo record);
}