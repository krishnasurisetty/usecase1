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
	private ProductRepository productRepositiory;

	/*@GetMapping(path="/product/{name}")
	public ResponseEntity<List<String>> getSimilarProducts(@PathVariable(name="name") String productName) {

		List<Product> products = prodctRepositiory.findByProductNameContaining(productName);
		List<String> productNames = products.stream().map(product->product.getProductName()).collect(Collectors.toList());

		return new ResponseEntity<List<String>>(productNames, HttpStatus.OK);
	}*/

	@GetMapping(path="/product/{name}")
	public ResponseEntity<List<Product>> getSimilarProducts(@PathVariable(name="name") String productName) {
		System.out.println(productRepositiory.findByProductNameContaining(productName));
		return new ResponseEntity<List<Product>>(productRepositiory.findByProductNameContaining(productName), HttpStatus.OK);
	}

}
