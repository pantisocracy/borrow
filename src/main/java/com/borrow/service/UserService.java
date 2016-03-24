package com.borrow.service;

import com.borrow.dao.mapper.CourseMapper;
import com.borrow.dao.mapper.UserInfoMapper;
import com.borrow.entity.CourseInfo;
import com.borrow.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * Created by lbc on 16/3/17.
 */
@Service
public class UserService {
    @Autowired
    private UserInfoMapper usersInfoMapper;

    @Autowired
    private CourseMapper courseMapper;


    public void save(UserInfo userInfo){
        usersInfoMapper.insert(userInfo);
    }

    public List<UserInfo> findAll(){
        List<CourseInfo> list = courseMapper.selectAll();
        //List<UserInfo> list = usersInfoMapper.selectAll();
        return usersInfoMapper.findAll();
    }

    public Page findAllByPage(Pageable pageable){
        return null;//usersInfoMapper.findAllByPage(pageable);
    }


    public UserInfo findByUserName(String userName){
        return usersInfoMapper.findByUserName(userName);
    }


}
