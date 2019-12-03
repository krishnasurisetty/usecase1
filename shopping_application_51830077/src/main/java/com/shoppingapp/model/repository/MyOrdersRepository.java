package com.shoppingapp.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoppingapp.model.entities.MyOrders;

public interface MyOrdersRepository extends JpaRepository<MyOrders, Long> {

}
