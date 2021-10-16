package com.codegym.service;

import com.codegym.model.Review;
import com.codegym.repository.ReviewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService implements IReviewService{
    @Autowired
    ReviewRepo reviewRepo;

    @Override
    public void save(Review review) {
        reviewRepo.save(review);
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Review> findAll() {
        List <Review> reviewList = (List<Review>) reviewRepo.findAll();
        return reviewList;
    }

    @Override
    public Review findByid(int id) {
        return null;
    }
}
