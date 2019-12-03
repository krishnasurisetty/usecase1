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
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Entity
@Table(name="user_table")
public class AppUser {

	private static BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

	@Column(name="user_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private Long userId;

	@Column(name="user_name")
	private String userName;

	@Column(name="user_email")
	private String userEmail;

	@Column(name="user_pasword")
	private String userPassword;

	@Column(name="user_address")
	private String userAddress;

	@Column(name="user_phone_number")
	private String userPhoneNumber;

	private String[] roles;

/*	@OneToMany(mappedBy="appUser", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Product> products = new ArrayList<Product>();*/

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPasssword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = encoder.encode(userPassword);
	}

	public String getUserAddress() {
		return userAddress;
	}

	public String[] getRoles() {
		return roles;
	}

	public void setRoles(String[] roles) {
		this.roles = roles;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	/*public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}*/

	public String getUserPhoneNumber() {
		return userPhoneNumber;
	}

	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}

	public AppUser() {

	}

	public AppUser(String userName, String userEmail, String userPassword, String userAddress, String userPhoneNumber,
			String[] roles) {
		this.userName = userName;
		this.userEmail = userEmail;
		setUserPassword(userPassword);
		this.userAddress = userAddress;
		this.userPhoneNumber = userPhoneNumber;
		this.roles = roles;
	}

}
