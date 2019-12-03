package com.shoppingapp.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoppingapp.model.entities.Product;
import com.shoppingapp.model.repository.ProductRepository;
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository; 
	@Override
	public List<Product> findByNameContaining(String name) {
		List<Product> products=	productRepository.findByNameContaining(name);
		return products;
	}
	@Override
	public Product findByName(String name) {
		Product product=productRepository.findByName(name);
		return product;
	}
	@Override
	public Product findById(Long id) {
		
		return productRepository.findById(id).orElseThrow(RuntimeException::new);
	}

}
