package com.tudien.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.TuDienServiceImp;

@Controller
public class TudienController {
    TuDienServiceImp tuDienServiceImp = new TuDienServiceImp();
    @GetMapping("search")
    public String result (@RequestParam String search, Model model) throws Exception {
        String searchValue = tuDienServiceImp.search(search);
        model.addAttribute("search",searchValue);
        return "index";
    }
}
