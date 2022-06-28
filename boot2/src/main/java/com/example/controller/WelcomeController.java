package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

	//@RequestMapping
	@GetMapping("/java")//We can use both any one annotation to get the data
	public String showMsg()
	{
		return "welcome";
	}
}

