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
        return "index";
    }

    /**
     * 前台登录
     * @return
     */
    @RequestMapping("/manLogin")
    public String manLogin(){
        return "manLogin";
    }

    /**
     * 前台登录提交,登录成功后查询商品课程列表 1，查询最新课程 2，查询推荐课程（目前写死）
     * @return
     */
    @RequestMapping("/manSubmit")
    public String manSubmit(){
        return "index";
    }


    /**
     * 前台查询推荐课程或者
     * @parameter  typeid =(1：查询最新课程，2：查询推荐课程)
     * @return
     */
    @RequestMapping("/products")
    public String products(){
        return "products";
    }

    /**
     * 前台查询推荐课程或者
     * @parameter  typeid =(1：查询最新课程，2：查询推荐课程)
     * @return
     */
    @RequestMapping("/single")
    public String single(){
        return "single";
    }

}
