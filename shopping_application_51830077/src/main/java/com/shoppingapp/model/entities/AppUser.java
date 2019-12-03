package com.shoppingapp.model.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
@Entity
@Table(name="user_table")
public class AppUser {
	private static BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String name;
private String password;
private String address;
private String email;
private String phoneNumber;
private String[]roles;
@OneToMany(mappedBy="appUser",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
private List<MyOrders> myOrders=new ArrayList<MyOrders>();
public void addMyOrders(MyOrders myOrder){
	myOrders.add(myOrder);
	myOrder.setAppUser(this);
}

public List<MyOrders> getMyOrders() {
	return myOrders;
}

public void setMyOrders(List<MyOrders> myOrders) {
	this.myOrders = myOrders;
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

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}

public String[] getRoles() {
	return roles;
}

public void setRoles(String[] roles) {
	this.roles = roles;
}


public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = encoder.encode(password);
}

public AppUser() {
	// TODO Auto-generated constructor stub
}

public AppUser(String name, String password, String address, String email, String phoneNumber, String[] roles) {
	super();
	this.name = name;
	setPassword(password);
	this.address = address;
	this.email = email;
	this.phoneNumber = phoneNumber;
	this.roles = roles;
}


}
