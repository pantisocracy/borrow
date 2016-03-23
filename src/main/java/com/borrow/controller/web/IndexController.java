package com.borrow.controller.web;

/**
 * Created by lbc on 16/3/18.
 */

import com.borrow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
      提交,登录成功后查询商品课程列表 1，查询最新课程 2，查询推荐课程（目前写死）
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
     * 查询课程详细内容 （并查询推荐课程）
     * @parameter  id 课程编号
     * @return
     */
    @RequestMapping("/single")
    public String single(){
        return "single";
    }


    /**
     * 查询我的课程列表
     * @parameter  userId 用户编号
     * @return
     */
    @RequestMapping("/checkout")
    public String checkout(){
        return "checkout";
    }

    /**
     * 删除我的课程（并根据用户编号重定向到用户课程列表:删除之前程序需验证是否是真实用户）
     * @parameter   id = 课程编号
     * @return
     */
    @RequestMapping("/checkoutDelete")
    public String checkoutDelete(){
        return "checkout";
    }

}
