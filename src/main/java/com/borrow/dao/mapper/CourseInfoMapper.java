package com.borrow.dao.mapper;

import com.borrow.entity.CourseInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface CourseInfoMapper extends BaseMapper<CourseInfo,Integer>{
    @Delete({
        "delete from course",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into course (id, course_name, ",
        "add_time, stages_type_id, ",
        "school_id, cover_img, ",
        "price, content)",
        "values (#{id,jdbcType=INTEGER}, #{courseName,jdbcType=VARCHAR}, ",
        "#{addTime,jdbcType=TIMESTAMP}, #{stagesTypeId,jdbcType=INTEGER}, ",
        "#{schoolId,jdbcType=INTEGER}, #{coverImg,jdbcType=VARCHAR}, ",
        "#{price,jdbcType=REAL}, #{content,jdbcType=LONGVARCHAR})"
    })
    int insert(CourseInfo record);

    int insertSelective(CourseInfo record);

    @Select({
        "select",
        "id, course_name, add_time, stages_type_id, school_id, cover_img, price, content",
        "from course",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("ResultMapWithBLOBs")
    CourseInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CourseInfo record);

    @Update({
        "update course",
        "set course_name = #{courseName,jdbcType=VARCHAR},",
          "add_time = #{addTime,jdbcType=TIMESTAMP},",
          "stages_type_id = #{stagesTypeId,jdbcType=INTEGER},",
          "school_id = #{schoolId,jdbcType=INTEGER},",
          "cover_img = #{coverImg,jdbcType=VARCHAR},",
          "price = #{price,jdbcType=REAL},",
          "content = #{content,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(CourseInfo record);

    @Update({
        "update course",
        "set course_name = #{courseName,jdbcType=VARCHAR},",
          "add_time = #{addTime,jdbcType=TIMESTAMP},",
          "stages_type_id = #{stagesTypeId,jdbcType=INTEGER},",
          "school_id = #{schoolId,jdbcType=INTEGER},",
          "cover_img = #{coverImg,jdbcType=VARCHAR},",
          "price = #{price,jdbcType=REAL}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CourseInfo record);
}