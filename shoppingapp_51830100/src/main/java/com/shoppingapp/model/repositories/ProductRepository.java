package com.shoppingapp.model.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.shoppingapp.model.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	public List<Product> findByProductNameContaining(String productName);
	
}
