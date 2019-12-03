package com.shoppingapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.shoppingapp.model.entities.AppUser;
import com.shoppingapp.model.entities.Product;
import com.shoppingapp.model.entities.Store;
import com.shoppingapp.model.repositories.AppUserRepository;
import com.shoppingapp.model.repositories.ProductRepository;
import com.shoppingapp.model.repositories.StoreRepository;

@SpringBootApplication
public class Shoppingapp51830100Application implements CommandLineRunner {

	@Autowired
	private AppUserRepository appUserRepository;

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private StoreRepository storeRepository;

	public static void main(String[] args) {
		SpringApplication.run(Shoppingapp51830100Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*AppUser user1 = new AppUser("k", "k@k.com", "kP", "KA", "1234", new String[]{"ROLE_USER"});
		AppUser user2 = new AppUser("k1", "k1@k1.com", "k1P", "K1A", "5678", new String[]{"ROLE_USER"});
		AppUser user3 = new AppUser("k2", "k2@k2.com", "k2P", "K2A", "3456", new String[]{"ROLE_USER"});


		appUserRepository.save(user1);
		appUserRepository.save(user2);
		appUserRepository.save(user3);
*/
		Product product1 = new Product("realme2pro", 8999);
		Product product2 = new Product("realme3pro", 9999);
		Product product3 = new Product("redminote5pro", 11999);

		/*user1.getProducts().add(product1);
		user1.getProducts().add(product2);

		user2.getProducts().add(product3);



		product1.setAppUser(user1);
		product2.setAppUser(user1);

		product3.setAppUser(user2);*/

	


	/*	List<Product> products = productRepository.findByProductNameContaining("realme");	
		System.out.println(products);*/
		
		Store store1 = new Store("BigC", "Bus Stand", "bigC@gmail.com", 4, 1);
		Store store2 = new Store("Lot", "HDFC", "Lot@gmail.com", 3, 1);
		Store store3 = new Store("Poorivika", "Nellore Road", "Poorivika@gmail.com", 4, 1);
		
		
		product1.getStores().add(store1);
		product1.getStores().add(store2);
		product1.getStores().add(store3);
		
		product2.getStores().add(store1);
		product2.getStores().add(store2);
		product2.getStores().add(store3);
		
		product3.getStores().add(store1);
		product3.getStores().add(store2);
		product3.getStores().add(store3);
		
		store1.getProducts().add(product1);
		store1.getProducts().add(product2);
		store1.getProducts().add(product3);
		
		store2.getProducts().add(product1);
		store2.getProducts().add(product2);
		store2.getProducts().add(product3);
		
		store3.getProducts().add(product1);
		store3.getProducts().add(product2);
		store3.getProducts().add(product3);
		
		
		productRepository.save(product1);
		productRepository.save(product2);
		productRepository.save(product3);
		
		storeRepository.save(store1);
		storeRepository.save(store2);
		storeRepository.save(store3);
		
		

	}

}
