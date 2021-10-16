package com.codegym.service;

import com.codegym.model.Review;

import java.util.List;

public interface IReviewService {
    void save (Review review);
    void delete (int id);
    List <Review> findAll ();
    Review findByid (int id);
}
