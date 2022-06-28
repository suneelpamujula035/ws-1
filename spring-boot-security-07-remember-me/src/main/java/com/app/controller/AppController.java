package com.app.controller;

import java.security.Principal;
import java.util.Collection;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {

	//Note: Principal means username
	@GetMapping("/")//secure page
	public String helloWorld(Principal principal, Authentication authentication, Model model)//This is optional
	{
		//If you want to get username of the user
		String username = principal.getName();
		System.out.println("Current logged in user is : "+username);
		//Fetching the roles or authorities
		Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
		System.out.println("Authorities of the User : "+authorities);
		
		model.addAttribute("username", username);
		model.addAttribute("authorities", authorities);
		return "home";
	}
	
	@GetMapping("/admin")
	public String adminPage()
	{
		return "admin-page";
	}
	
	@GetMapping("/user")
	public String userPage()
	{
		return "user-page";
	}
	
	@GetMapping("/accessDenied")
	public String errorPage()
	{
		return "access-denied";
	}

}
