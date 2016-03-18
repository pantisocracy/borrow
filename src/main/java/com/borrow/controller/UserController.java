package com.borrow.controller;

import com.borrow.entity.UserInfo;
import com.borrow.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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
        UserInfo userInfo = new UserInfo();
        userInfo.setUpdateTime(new Date());
        userInfo.setType(2);
        userInfo.setApplyAccount(1);
        userInfo.setIdentity("dsddsd");
        userInfo.setAddTime(new Date());
        userInfo.setAge(12);
        userInfo.setMobile("18727151796");
        userInfo.setSchoolId(11);
        userInfo.setSex(1);
        userInfo.setUserName("admin");
        userService.save(userInfo);
    }

    @Transactional
    @RequestMapping("/find")
    @ResponseBody
    public String sayHello() {
        PageRequest pageRequest = new PageRequest(0, 10);
        Page page = userService.findAllByPage(pageRequest);
        System.out.println(page.getContent().toString());
        List<UserInfo> list = userService.findAll();
        return list.toString();
    }
    //跳转到jsp页面
    @RequestMapping("/jsp")
    public String getJsp() {
        return "index";
    }

}
