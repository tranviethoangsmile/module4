package com.codegym.controller;

import com.codegym.model.Mail;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/home")
public class FormMailController {
    @GetMapping ("")
    public String home (@ModelAttribute("mail") Mail mail, Model model) {
        List <String> language = Arrays.asList("English","Japanese","VietNamese");
        model.addAttribute("language",language);
        List <Integer> page = Arrays.asList(5,10,15,20);
        model.addAttribute("page",page);
        return "/home";
    }

    @PostMapping ("/mail")
    public String saveMail (@ModelAttribute("mail") Mail mail,Model model) {
        model.addAttribute("mail",mail);
//        model.addAttribute("page",mail.getPageSize());
//        model.addAttribute("spam",mail.isSpams());
//        model.addAttribute("sigu",mail.getSignature());
        return "/views";
    }
}
