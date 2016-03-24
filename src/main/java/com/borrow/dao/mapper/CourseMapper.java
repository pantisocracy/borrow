package com.borrow.dao.mapper;

import com.borrow.entity.Course;
import com.borrow.util.MyMapper;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface CourseMapper extends MyMapper<Course>{

    @Select("SELECT id,course_name,add_time,stages_type_id,school_id,cover_img,price,content FROM course order by add_time desc limit 0,10")
    List<Course> findByDesc(Integer offest, Integer size);
}