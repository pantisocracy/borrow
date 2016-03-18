package com.borrow.controller;

import com.borrow.entity.UsersInfo;
import com.borrow.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * Created by Lipengfei on 2015/6/24.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @Transactional
    @RequestMapping("/save")
    @ResponseBody
    public void save() {
        UsersInfo usersInfo = new UsersInfo();
        usersInfo.setId(1);
        usersInfo.setAge(18);
        usersInfo.setName("admin");
        usersInfo.setSex(1);
        usersInfo.setMobile(12112);
        usersInfo.setSchoolId(212121);
        usersInfo.setIdentity("1");
        usersInfo.setSchoolId(1111);
        usersInfo.setAddTime(new Date());
        usersInfo.setApplyAccount(3232);
        usersInfo.setType(1);
        usersInfo.setUpdateTime(new Date());
        userService.save(usersInfo);
    }

    @Transactional
    @RequestMapping("/find")
    @ResponseBody
    public String sayHello() {
        return null;
    }
    //跳转到jsp页面
    @RequestMapping("/jsp")
    public String getJsp() {
        return "index";
    }

}
