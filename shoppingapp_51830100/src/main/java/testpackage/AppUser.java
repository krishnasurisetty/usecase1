/*package testpackage;

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

@Entity
@Table(name="user_table")
public class AppUser {

	@Column(name="user_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private Long userId;

	@Column(name="user_name")
	private String userName;

	@Column(name="user_email")
	private String userEmail;

	@Column(name="user_password")
	private String userPasssword;

	@Column(name="user_address")
	private String userAddress;

	@Column(name="user_phone_number")
	private String userPhoneNumber;
	
	@OneToMany(mappedBy="appUser", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Product> products = new ArrayList<Product>();

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
		return userPasssword;
	}

	public void setUserPasssword(String userPasssword) {
		this.userPasssword = userPasssword;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public String getUserPhoneNumber() {
		return userPhoneNumber;
	}

	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}

	public AppUser() {

	}

	public AppUser(String userName, String userEmail, String userPasssword, String userAddress,
			String userPhoneNumber) {
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPasssword = userPasssword;
		this.userAddress = userAddress;
		this.userPhoneNumber = userPhoneNumber;
	}



}
*/