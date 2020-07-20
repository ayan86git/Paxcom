package com.paxcom.task.services;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService{

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// For this demo a default hard coded user is getting returned.
		// In real life projects from this code there should be a method call to get 
		// user from IDPs like EDirectory or AD.
		return new User("ayan", "{noop}ayan123", new ArrayList<>());
	}

}
