package com.codegym.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @RequestMapping ("calculator")
    public String calculator (@RequestParam int firstNum, String action, int lastNum,Model model) {
        int result = 0;
       switch (action) {
           case "add":
               result = firstNum + lastNum;
               model.addAttribute("mess", "addition");
               model.addAttribute("result", result);
               break;
           case "sub":
               result = firstNum - lastNum;
               model.addAttribute("mess", "subtraction");
               model.addAttribute("result", result);
               break;
           case "mul":
               result = firstNum * lastNum;
               model.addAttribute("mess", "multiplication");
               model.addAttribute("result", result);
               break;
           case "div":
               model.addAttribute("mess", "division");
               result = firstNum / lastNum;
               model.addAttribute("result", result);
               break;
       }
        return "index.jsp";
    }
}
