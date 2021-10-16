package com.codegym.controller;

import com.codegym.model.Review;
import com.codegym.service.IReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("review")
public class ReviewController {
    @Autowired
    IReviewService reviewService;
    @GetMapping("")
    public ModelAndView reviewService (@ModelAttribute("review") Review review) {
        ModelAndView modelAndView = new ModelAndView("/review");
        modelAndView.addObject("review",new Review());
        return modelAndView;
    }

    @PostMapping("feedback")
    public String saveFeedback (Review review, Model model) {
        reviewService.save(review);
        System.out.println("review");
        List <Review> reviewList = reviewService.findAll();
        System.out.println(reviewList);
        model.addAttribute("listreview",reviewList);
        return "/review";
    }
}
