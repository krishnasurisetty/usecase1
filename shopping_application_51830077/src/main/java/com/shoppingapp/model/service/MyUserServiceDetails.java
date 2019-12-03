package com.shoppingapp.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.shoppingapp.model.entities.AppUser;
import com.shoppingapp.model.repository.AppUserRepository;
@Service
public class MyUserServiceDetails implements UserDetailsService {
@Autowired
private AppUserRepository appUserRepository ;
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
	AppUser appUser=appUserRepository.findByEmail(email);
	if(appUser==null){
		throw new RuntimeException();
	}
	else{
		return new User(appUser.getEmail(), appUser.getPassword(), AuthorityUtils.createAuthorityList(appUser.getRoles()));
	}
	
		
	}

}
