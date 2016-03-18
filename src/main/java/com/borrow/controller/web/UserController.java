package com.borrow.controller.web;

import com.borrow.param.UserParam;
import com.borrow.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Lipengfei on 2015/6/24.
 */
@Controller
@RequestMapping("user")
public class UserController {
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
    public ResponseEntity login(String userName,String passWord) {
        Subject currentUser = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(userName, passWord);
        token.setRememberMe(false);
        try {
            currentUser.login(token);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("");
        }
        return ResponseEntity.ok("");
    }

}
