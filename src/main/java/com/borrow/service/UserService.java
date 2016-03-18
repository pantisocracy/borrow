package com.borrow.service;

import com.borrow.dao.mapper.UsersInfoMapper;
import com.borrow.entity.UsersInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lbc on 16/3/17.
 */
@Service
public class UserService {

    @Autowired
    private UsersInfoMapper usersInfoMapper;

    public void save(UsersInfo usersInfo){
        usersInfoMapper.insert(usersInfo);
    }
}
