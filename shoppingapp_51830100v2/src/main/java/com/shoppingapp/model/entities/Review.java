package com.shoppingapp.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="review_table")
public class Review {

	@Column(name="review_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private Long reviewId;
	
	@Column(name="individual_rating")
	private double rating;
	
	@Column(name="store_review")
	private String storeReview;
	
	@Column(name="reviewed_user_email")
	private String reviewUserEmail;
	
	@JoinColumn(name="store_id_fk")
	@ManyToOne
	private Store store;

	public Long getReviewId() {
		return reviewId;
	}

	public void setReviewId(Long reviewId) {
		this.reviewId = reviewId;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getStoreReview() {
		return storeReview;
	}

	public void setStoreReview(String storeReview) {
		this.storeReview = storeReview;
	}

	public String getReviewUserEmail() {
		return reviewUserEmail;
	}

	public void setReviewUserEmail(String reviewUserEmail) {
		this.reviewUserEmail = reviewUserEmail;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public Review(double rating, String storeReview, String reviewUserEmail, Store store) {
		this.rating = rating;
		this.storeReview = storeReview;
		this.reviewUserEmail = reviewUserEmail;
		this.store = store;
	}
	
	public Review(double rating, String storeReview, String reviewUserEmail) {
		this.rating = rating;
		this.storeReview = storeReview;
		this.reviewUserEmail = reviewUserEmail;
	}
	
	public Review() {
		
	}
	
	
}
