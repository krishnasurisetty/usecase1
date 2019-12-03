package com.shoppingapp.model.service;

import java.util.List;

import com.shoppingapp.model.entities.Review;

public interface ReviewService {
public List<Review> saveReview(Review review,Long id);

}
