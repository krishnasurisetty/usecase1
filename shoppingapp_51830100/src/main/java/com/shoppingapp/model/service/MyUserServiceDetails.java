package com.shoppingapp.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.shoppingapp.model.entities.AppUser;
import com.shoppingapp.model.repositories.AppUserRepository;

public class MyUserServiceDetails implements UserDetailsService {

	@Autowired
	private AppUserRepository appUserRepository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		AppUser appUser = appUserRepository.findByUserEmail(email);

		if(appUser != null)
			return new User(appUser.getUserEmail(), appUser.getUserPasssword(), AuthorityUtils.createAuthorityList(appUser.getRoles()));
		else 
			throw new UsernameNotFoundException("Not Found");
	}

}
