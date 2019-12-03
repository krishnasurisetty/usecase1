package com.shoppingapp.web.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingapp.model.entities.MyOrders;
import com.shoppingapp.model.entities.Product;
import com.shoppingapp.model.entities.Review;
import com.shoppingapp.model.service.MyOrdersService;
import com.shoppingapp.model.service.ProductService;
import com.shoppingapp.model.service.ReviewService;
import com.shoppingapp.web.controller.beans.PurchaseRequest;

@RestController
public class ProductController {
	@Autowired
	private ProductService productService;
	@Autowired	
	private MyOrdersService myOrdersService;
	@Autowired
	private ReviewService reviewService;
	@GetMapping(path="product/search/{name}")
	public ResponseEntity<List<String>> getProductsThatNameContaining(@PathVariable( name="name")String name){
		List<Product>	products=	productService.findByNameContaining(name);
		List<String> names = products.stream().map(product->product.getName()).collect(Collectors.toList());
		return ResponseEntity.ok().body(names);
	}
	@GetMapping(path="product/{name}")
	public ResponseEntity<Product> getProductDetails(@PathVariable( name="name")String name){
		Product	product=productService.findByName(name);

		return ResponseEntity.ok().body(product);
	}
	@PostMapping(path="/store/product")
	public List<MyOrders> purchaseOfProductInParticularStore(@AuthenticationPrincipal User user,
			@RequestBody PurchaseRequest request){
		Product	product=productService.findById(request.getProductId());
		List<MyOrders> myOrders=myOrdersService.saveOrder(product, user,request.getStoreId());
		return myOrders;

	}
	@PostMapping(path="/store/{id}/rating")
	public List<Review> storeReview(@PathVariable(name="id")Long id,@RequestBody Review review){
		List<Review> reviews=reviewService.saveReview(review, id);
		return reviews;

	}
}
