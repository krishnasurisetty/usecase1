package com.shoppingapp.web.controller.beans;

public class PurchaseRequest {
private Long storeId;
private Long productId;
public Long getStoreId() {
	return storeId;
}
public void setStoreId(Long storeId) {
	this.storeId = storeId;
}
public Long getProductId() {
	return productId;
}
public void setProductId(Long productId) {
	this.productId = productId;
}
public PurchaseRequest() {
	// TODO Auto-generated constructor stub
}
public PurchaseRequest(Long storeId, Long productId) {
	super();
	this.storeId = storeId;
	this.productId = productId;
}

}
