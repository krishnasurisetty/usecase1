package com.shoppingapp.model.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="store_table1")
public class Store {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String name;
private String phoneNumber;
private String email;
private Double review;
private Long noOfReviews;
@JsonIgnore
@ManyToMany(cascade=CascadeType.ALL)
private List<Product> products=new ArrayList<Product>();
@JsonIgnore
@OneToMany(mappedBy="store",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
private List<Review> reviews=new ArrayList<Review>();

public void addProduct(Product product){
	products.add(product);
	product.addStores(this);
}

public void addReview(Review review){
	reviews.add(review);
	review.setStore(this);
}



public List<Review> getReviews() {
	return reviews;
}

public void setReviews(List<Review> reviews) {
	this.reviews = reviews;
}

public List<Product> getProducts() {
	return products;
}
public void setProducts(List<Product> products) {
	this.products = products;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Double getReview() {
	return review;
}
public void setReview(Double review) {
	this.review = review;
}
public Long getNoOfReviews() {
	return noOfReviews;
}
public void setNoOfReviews(Long noOfReviews) {
	this.noOfReviews = noOfReviews;
}
public Store(String name, String phoneNumber, String email, Double review, Long noOfReviews) {
	super();
	this.name = name;
	this.phoneNumber = phoneNumber;
	this.email = email;
	this.review = review;
	this.noOfReviews = noOfReviews;
}
public Store() {
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Store [id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + ", email=" + email + ", review="
			+ review + ", noOfReviews=" + noOfReviews + "]";
}

}
