package com.shoppingapp.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoppingapp.model.entities.Store;

public interface StoreRepository extends JpaRepository<Store, Long>{

}
