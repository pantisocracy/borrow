package com.borrow.controller.web;

/**
 * Created by lbc on 16/3/18.
 */

import com.borrow.entity.UserInfo;
import com.borrow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * web目录前台
 * 主页
 */
@Controller
@RequestMapping("web/")
public class IndexController {
    @Autowired
    private UserService userService;
    /**
     * 首页
     * @return
     */
    @RequestMapping("/index")
    public String index(){
        List<UserInfo> list = userService.findAll();
        for (UserInfo userInfo:list){
            System.out.println(userInfo.toString());
        }
        return "index";
    }



}
