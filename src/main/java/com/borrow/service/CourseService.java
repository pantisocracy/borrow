package com.borrow.service;

import com.borrow.dao.mapper.CourseMapper;
import com.borrow.entity.Course;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lbc on 16/3/24.
 */
@Service
public class CourseService {
    @Autowired
    private CourseMapper courseMapper;

    /**
     * 按条件分页查询
     *
     * @return
     */
    public List<Course> findByPage(Course course, Integer offest, Integer size) {
        RowBounds rowBounds = new RowBounds(offest, size);
        return courseMapper.selectByRowBounds(course, rowBounds);
    }

    public List<Course> findByDesc(Integer offest, Integer size) {
        return courseMapper.findByDesc(offest,size);
    }

}
