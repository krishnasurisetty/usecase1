  package com.shoppingapp.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="reviews_table")
public class Review {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private Double review;
private String comment;
@JsonIgnore
@ManyToOne
private Store store;


public Store getStore() {
	return store;
}
public void setStore(Store store) {
	this.store = store;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Double getReview() {
	return review;
}
public void setReview(Double review) {
	this.review = review;
}

public String getComment() {
	return comment;
}
public void setComment(String comment) {
	this.comment = comment;
}
public Review(Double review, String comment) {
	super();
	this.review = review;
	this.comment = comment;
}
public Review() {
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Review [id=" + id + ", review=" + review + ", comment=" + comment + "]";
}

}
