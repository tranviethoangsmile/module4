package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandWichController {
@RequestMapping("comdiments")
    public String condiments (@RequestParam String comdiments, Model model) {
    model.addAttribute("comdiments",comdiments);
    return "index.jsp";
}
}
