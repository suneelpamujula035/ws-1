package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyNameController {

	@GetMapping("/getName/{name}")//Not a secure page
	public String getName(@PathVariable String name)
	{
		return "Good evening Mr."+name;
	}
}
