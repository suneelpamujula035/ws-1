package com.example.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@GetMapping("/")
	public String welcomeMsg()
	{
		return "Welcome to GitHub....";
	}

	
	@GetMapping("/user")
	public Principal useretails(Principal principal)
	{
		System.out.println("UserName : "+principal.getName());
		return principal;
	}
}
