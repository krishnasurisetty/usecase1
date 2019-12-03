package com.shoppingapp.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoppingapp.model.entities.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, Long>{
public AppUser findByEmail(String name);
}
