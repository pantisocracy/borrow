package com.borrow.controller;

import com.borrow.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

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
