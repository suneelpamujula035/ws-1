package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {

	@GetMapping("/home")//secure page
	public String helloWorld()
	{
		return "home";
	}
	
	@ResponseBody
	@GetMapping("/hi")//Secure page
	public String hi()
	{
		return "Hiii from Suneel";
	}
	
	@ResponseBody
	@GetMapping("/bye")//Secure page
	public String bye()
	{
		return "Bye Bye from Suneel";
	}

}
