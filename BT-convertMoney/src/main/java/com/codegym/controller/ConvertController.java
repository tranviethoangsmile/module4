package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertController {
    private int convert;
    private Model model;

    @GetMapping("/convert")
    public String convert (@RequestParam int usd, Model model) {
        int money = usd * 22000;
        model.addAttribute("money",money);
        return "convert";
    }

    @GetMapping("/total")
    public String total (@RequestParam int vnd, Model model) {
        int usd = vnd / 22000;
        model.addAttribute("usd", usd);
        return "convert";
    }
}
