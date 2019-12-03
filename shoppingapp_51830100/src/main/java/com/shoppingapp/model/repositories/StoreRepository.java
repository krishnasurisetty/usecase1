package com.shoppingapp.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoppingapp.model.entities.Store;

public interface StoreRepository extends JpaRepository<Store, Long> {

}
