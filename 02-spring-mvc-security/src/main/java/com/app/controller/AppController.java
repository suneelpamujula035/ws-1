package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {

	@GetMapping("/hello")
	public String helloWorld()
	{
		return "hello-world";
	}
	
	@ResponseBody
	@GetMapping("/hi")
	public String hi()
	{
		return "Hiii from Suneel";
	}
	
	@ResponseBody
	@GetMapping("/bye")
	public String bye()
	{
		return "Bye Bye from Suneel";
	}
}
