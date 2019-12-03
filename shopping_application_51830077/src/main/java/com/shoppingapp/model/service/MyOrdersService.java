package com.shoppingapp.model.service;

import java.util.List;

import org.springframework.security.core.userdetails.User;

import com.shoppingapp.model.entities.MyOrders;
import com.shoppingapp.model.entities.Product;

public interface MyOrdersService  {
public List<MyOrders> saveOrder(Product product,User user,Long storeId);
}
