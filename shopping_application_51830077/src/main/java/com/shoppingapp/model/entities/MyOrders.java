package com.shoppingapp.model.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="order_table")
public class MyOrders {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String name;
private Double price;
private LocalDateTime localDateTime;
private Long storeId;
@JsonIgnore
@ManyToOne
private AppUser appUser;



public MyOrders(String name, Double price, LocalDateTime localDateTime, Long storeId) {
	super();
	this.name = name;
	this.price = price;
	this.localDateTime = localDateTime;
	this.storeId = storeId;
}


@Override
public String toString() {
	return "MyOrders [id=" + id + ", name=" + name + ", price=" + price + ", localDateTime=" + localDateTime
			+ ", storeId=" + storeId + "]";
}


public Long getStoreId() {
	return storeId;
}


public void setStoreId(Long storeId) {
	this.storeId = storeId;
}


public void setAppUser(AppUser appUser) {
	this.appUser = appUser;
}


public AppUser getAppUser() {
	return appUser;
}



public MyOrders() {
	// TODO Auto-generated constructor stub
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
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public LocalDateTime getLocalDateTime() {
	return localDateTime;
}
public void setLocalDateTime(LocalDateTime localDateTime) {
	this.localDateTime = localDateTime;
}

}
