package com.shoppingapp.model.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="products_table")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String name;
private Double price;

@ManyToMany(mappedBy="products",cascade=CascadeType.ALL)
private List<Store> stores=new ArrayList<Store>();

public void addStores(Store store){
	stores.add(store);
}

public List<Store> getStores() {
	return stores;
}
public void setStores(List<Store> stores) {
	this.stores = stores;
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

public Product(String name, Double price) {
	super();
	this.name = name;
	this.price = price;

}

public Product() {
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
}

}
