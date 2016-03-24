package com.borrow.controller.web;

/**
 * Created by lbc on 16/3/18.
 */

import com.alibaba.druid.support.json.JSONUtils;
import com.borrow.entity.Course;
import com.borrow.service.CourseService;
import com.borrow.service.UserService;
import com.borrow.util.JSonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * web目录前台
 * 主页
 */
@Controller
@RequestMapping("web/")
public class IndexController {
    @Autowired
    private UserService userService;

    @Autowired
    private CourseService courseService;


    @RequestMapping("/findAll")
    public void findAll(){
        userService.findAll();
    }

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
    public ModelAndView manSubmit(HttpServletResponse response){
        /**
         * 1 类型表示推荐
         */
        Course course = new Course();
        course.setStagesTypeId(1);
        //推荐
        List<Course> list = courseService.findByPage(course, 0, 10);
        Map paramData = new HashMap();
        paramData.put("tjList", JSonUtil.toJson(list));
        //最新的
        list=courseService.findByDesc(0,10);
        paramData.put("newList", JSonUtil.toJson(list));
        return new ModelAndView("index", paramData);
    }
    /**
     * 前台查询推荐课程或者
     * @parameter  typeid =(1：查询最新课程，2：查询推荐课程)
     * @return
     */
    @RequestMapping("/products")
    public ModelAndView products(){
        Course course = new Course();
        course.setStagesTypeId(1);
        //推荐
        List<Course> list = courseService.findByPage(course, 0, 10);
        Map paramData = new HashMap();
        paramData.put("tjList", JSonUtil.toJson(list));
        //最新的
        list=courseService.findByDesc(0,10);
        paramData.put("newList", JSonUtil.toJson(list));
        return new ModelAndView("products", paramData);
    }

    /**
     * 查询课程详细内容 （并查询推荐课程）
     * @parameter  id 课程编号
     * @return
     */
    @RequestMapping("/single")
    public ModelAndView single(){
        Course course = new Course();
        course.setStagesTypeId(1);
        //推荐
        List<Course> list = courseService.findByPage(course, 0, 10);
        Map paramData = new HashMap();
        paramData.put("tjList", JSonUtil.toJson(list));
        return new ModelAndView("single", paramData);
    }

}
