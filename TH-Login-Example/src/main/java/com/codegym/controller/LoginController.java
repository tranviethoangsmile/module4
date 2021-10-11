package com.codegym.controller;

import com.codegym.dao.DaoUser;
import com.codegym.model.Login;
import com.codegym.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    @GetMapping("login")
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView("login","login",new Login());
        return modelAndView;
    }

    @PostMapping("login")
    public ModelAndView home (@ModelAttribute ("login") Login login) {
        User user = DaoUser.checkLogin(login);
        if (user == null) {
            ModelAndView modelAndView = new ModelAndView("error");
            return modelAndView;
        }else {
            ModelAndView modelAndView = new ModelAndView("user");
            modelAndView.addObject("user", user);
            return modelAndView;
        }

    }
}
