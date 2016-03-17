package com.borrow.service;

import com.borrow.dao.mapper.UserMapper;
import com.borrow.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Lipengfei on 2015/6/26.
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserInfoMapper userInfoMapper;

    public List<User> getUserMapper() {
        List<User> userList = userMapper.findAll();
        return userList;
    }

    public List<User> getUserMapperByPage() {
        PageRequest pageRequest = new PageRequest(0, 10);
        Page<User> page = userMapper.findAllByPage(pageRequest);
        List<User> list = page.getContent();
        return list;
    }
    public void save(User user) {
        userMapper.save(user);

    }

    public void save(UserInfo userInfo){
        userInfoMapper.insert(userInfo);
    }
}
