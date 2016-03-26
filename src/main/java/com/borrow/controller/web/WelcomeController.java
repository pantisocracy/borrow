package com.borrow.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lbc on 16/3/25.
 */
@Controller
public class WelcomeController {
    @RequestMapping("/")
    public ModelAndView welcome() {
        return new ModelAndView("redirect:/web/index");
    }
}
