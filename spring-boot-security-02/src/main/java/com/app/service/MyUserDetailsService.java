package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.app.entity.User;
import com.app.repository.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService{

	@Autowired 
	private UserRepository userRepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepo.findByUserName(username);
		if(user==null)
		{
			throw new UsernameNotFoundException("User or Password Invalid");
		}
		return new UserPrincipal(user);
	}

}
