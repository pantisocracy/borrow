package com.borrow.service;

import com.borrow.dao.mapper.UsersMapper;
import com.borrow.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lbc on 16/3/17.
 */
@Service
public class UserService {
    @Autowired
    private UsersMapper usersMapper;


    public void save(Users user){
        usersMapper.insert(user);
    }

    public List<Users> findAll(){
        return usersMapper.selectAll();
    }

    public Users findByUserName(String userName){
        return usersMapper.findByUserName(userName);
    }


}
