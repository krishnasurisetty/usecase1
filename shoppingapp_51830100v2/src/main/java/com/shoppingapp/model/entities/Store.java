package com.shoppingapp.model.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
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
@Table(name="store_table")
public class Store {

	@Column(name="store_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private Long storeId;

	@Column(name="store_name")
	private String storeName;

	@Column(name="store_address")
	private String storeAddress;

	@Column(name="store_email")
	private String storeEmail;

	@Column(name="store_rating")
	private double storeRating;

	@Column(name="number_of_ratings_for_store")
	private int numberofRatings;

	@JsonIgnore
	@ManyToMany(cascade=CascadeType.ALL)
	private List<Product> products = new ArrayList<Product>();
	
	@OneToMany(mappedBy="store", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Review> reviews = new ArrayList<Review>();

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	public Long getStoreId() {
		return storeId;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreAddress() {
		return storeAddress;
	}

	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}

	public String getStoreEmail() {
		return storeEmail;
	}

	public void setStoreEmail(String storeEmail) {
		this.storeEmail = storeEmail;
	}

	public double getStoreRating() {
		return storeRating;
	}

	public void setStoreRating(double storeRating) {
		this.storeRating = storeRating;
	}

	public int getNumberofRatings() {
		return numberofRatings;
	}

	public void setNumberofRatings(int numberofRatings) {
		this.numberofRatings = numberofRatings;
	}

	public Store() {

	}

	public Store(String storeName, String storeAddress, String storeEmail, double storeRating, int numberofRatings) {
		this.storeName = storeName;
		this.storeAddress = storeAddress;
		this.storeEmail = storeEmail;
		this.storeRating = storeRating;
		this.numberofRatings = numberofRatings;
	}

	@Override
	public String toString() {
		return "Store [storeId=" + storeId + ", storeName=" + storeName + ", storeAddress=" + storeAddress
				+ ", storeEmail=" + storeEmail + ", storeRating=" + storeRating + ", numberofRatings=" + numberofRatings
				+ "]";
	}


}


/*package com.shoppingapp.model.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="store_table")
public class Store {

	@Column(name="store_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private Long storeId;

	@Column(name="store_name")
	private String storeName;

	@Column(name="store_address")
	private String storeAddress;

	@Column(name="store_email")
	private String storeEmail;

	@Column(name="store_rating")
	private double storeRating;

	@Column(name="store_number_of_ratings")
	private int numberofRatings;

	@JsonIgnore
	@ManyToMany(cascade=CascadeType.ALL)
	private List<Product> products = new ArrayList<Product>();

	public Long getStoreId() {
		return storeId;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreAddress() {
		return storeAddress;
	}

	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}

	public String getStoreEmail() {
		return storeEmail;
	}

	public void setStoreEmail(String storeEmail) {
		this.storeEmail = storeEmail;
	}

	public double getStoreRating() {
		return storeRating;
	}

	public void setStoreRating(double storeRating) {
		this.storeRating = storeRating;
	}

	public int getNumberofRatings() {
		return numberofRatings;
	}

	public void setNumberofRatings(int numberofRatings) {
		this.numberofRatings = numberofRatings;
	}

	public Store() {

	}

	public Store(String storeName, String storeAddress, String storeEmail, double storeRating, int numberofRatings) {
		this.storeName = storeName;
		this.storeAddress = storeAddress;
		this.storeEmail = storeEmail;
		this.storeRating = storeRating;
		this.numberofRatings = numberofRatings;
	}

	@Override
	public String toString() {
		return "Store [storeId=" + storeId + ", storeName=" + storeName + ", storeAddress=" + storeAddress
				+ ", storeEmail=" + storeEmail + ", storeRating=" + storeRating + ", numberofRatings=" + numberofRatings
				+ "]";
	}


}
*/