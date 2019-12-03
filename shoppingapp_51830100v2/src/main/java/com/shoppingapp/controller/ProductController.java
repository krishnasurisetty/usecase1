package com.shoppingapp.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingapp.model.entities.Product;
import com.shoppingapp.model.repositories.ProductRepository;

@RestController
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;

	@GetMapping(path="/product/{name}")
	public ResponseEntity<List<String>> getSimilarProducts(@PathVariable(name="name") String productName) {
		
	List<Product> products = productRepository.findByProductNameContaining(productName);
	List<String> productNames = products.stream().map(product->product.getProductName()).collect(Collectors.toList());
		
		return new ResponseEntity<List<String>>(productNames, HttpStatus.OK);
	}
	
	
/*	@GetMapping(path="/products/{name}")
	public ResponseEntity<List<Product>> getSimilarProductss(@PathVariable(name="name") String productName) {
		
		List<Product> products = productRepository.findByProductNameContaining(productName);	
		System.out.println("---------------------------------------");
		System.out.println(products);
		
		return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
	}
	*/
	
	
	@GetMapping(path="/products/name=?")
	public ResponseEntity<List<Product>> getSimilarProductss(@PathVariable(name="name") String productName) {
		
		List<Product> products = productRepository.findByProductNameContaining(productName);	
		System.out.println("---------------------------------------");
		System.out.println(products);
		
		return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
	}
	
	
	
}
