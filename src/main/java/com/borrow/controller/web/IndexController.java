package com.borrow.controller.web;

/**
 * Created by lbc on 16/3/18.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * web目录前台
 * 主页
 */
@Controller
@RequestMapping("web/")
public class IndexController {
    /**
     * 首页
     * @return
     */
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
