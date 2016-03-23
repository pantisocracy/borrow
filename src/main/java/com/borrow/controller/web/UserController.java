package com.borrow.controller.web;

import com.borrow.exception.ErrorCodeEnum;
import com.borrow.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lipengfei on 2015/6/24.
 */
@Controller
@RequestMapping("user")
public class UserController extends BaseController{
    private final static Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    /**
     * 跳转到登陆页面
     * @return
     */
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/submit")
    @ResponseBody
    public void login(String userName,String passWord,HttpServletResponse response) {
        Subject currentUser = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(userName, passWord);
        try {
            currentUser.login(token);
            renderSuccessJson(response,"100","登陆成功",null);
        } catch (UnknownAccountException e) {
            logger.error("用户不存在", e);
            renderSuccessJson(response,"200","用户不存在",null);
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
    }
}
