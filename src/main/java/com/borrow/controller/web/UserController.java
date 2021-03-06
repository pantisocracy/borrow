package com.borrow.controller.web;

import com.borrow.entity.Users;
import com.borrow.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lipengfei on 2015/6/24.
 */
@Controller
@RequestMapping("user")
public class UserController extends BaseController {
    private final static Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    /**
     * 跳转到登陆页面
     *
     * @return
     */
    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/submit")
    public String login(String userName, String passWord, HttpServletResponse response) {
        Subject currentUser = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(userName, passWord);
        try {
            currentUser.login(token);
            //renderSuccessJson(response, "100", "登陆成功", token);
            return "../admin/index";
        } catch (UnknownAccountException e) {
            logger.error("用户不存在", e);
            renderSuccessJson(response, "200", "用户不存在", null);
        } catch (IncorrectCredentialsException e) {
            logger.error("密码错误", e);
            renderSuccessJson(response, "200", "密码错误", null);
        } catch (LockedAccountException e) {
            logger.error("账户已锁定", e);
            renderSuccessJson(response, "200", "账户已锁定", null);
        } catch (ExcessiveAttemptsException e) {
            logger.error("尝试次数过多", e);
            renderSuccessJson(response, "200", "尝试次数过多", null);
        } catch (AuthenticationException e) {
            logger.error("认证失败！", e);
            renderSuccessJson(response, "200", "认证失败", null);
        }
        return "login";
    }

    /**
     * 跳转到登陆注册页面
     *
     * @return
     */
    @RequestMapping("/userRegister")
    public String userRegister() {
        return "register";
    }
    /**
     * 添加用户（成功后重定向到index）
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, value = "/userRegisterAdd")
    public String userAdd(HttpServletResponse response, Users user) {
        try {
            if (StringUtils.isBlank(user.getUserName())) {
                renderSuccessJson(response, "2000", "用户名不能为空", null);
            }
            if (StringUtils.isBlank(user.getPassWord())) {
                renderSuccessJson(response, "2000", "用户密码不能为空", null);
            }
            if (StringUtils.isBlank(user.getMobile())) {
                renderSuccessJson(response, "2000", "手机号不能为空", null);
            }
            user.setAddTime(new Date());
            user.setUpdateTime(new Date());
            userService.save(user);
        } catch (Exception e) {
            logger.error("userRegisterAdd Exception", e);
            renderSuccessJson(response, "2000", "注册失败请稍后再试", null);
        }
        return "index";
    }

    /**
     * 查询我的课程列表
     * @parameter  userId 用户编号
     * @return
     */
    @RequestMapping("/checkout")
    public ModelAndView checkout(){
        Map paramData = new HashMap();



        return new ModelAndView("single", paramData);
    }

    /**
     * 删除我的课程（并根据用户编号重定向到用户课程列表:删除之前程序需验证是否是真实用户）
     * @parameter   id = 课程编号
     * @return
     */
    @RequestMapping("/checkoutDelete")
    public ModelAndView checkoutDelete(){
        Map paramData = new HashMap();


        return new ModelAndView("checkout", paramData);
    }

    /**
     * 登录
     *
     * @return
     */
    @RequestMapping("/index")
    public String index() {
        return "../admin/index";
    }
}
