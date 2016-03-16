package com.borrow.controller;

import com.borrow.entity.User;
import com.borrow.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
        User user = new User();
        user.setId(2L);
        user.setUsername("liangbicong");
        user.setPassword("liangbicong");
        userService.sive(user);
    }

    @Transactional
    @RequestMapping("/find")
    @ResponseBody
    public String sayHello() {
        //mybatis查询
        List<User> userList = userService.getUserMapper();
        System.out.println(userList.toString());
        //分页查询
        userList = userService.getUserMapperByPage();
        System.out.println(userList.toString());
        return userList.toString();
    }
    //跳转到jsp页面
    @RequestMapping("/jsp")
    public String getJsp() {
        return "index";
    }

}
