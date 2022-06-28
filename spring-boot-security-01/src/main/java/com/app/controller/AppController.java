package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@GetMapping("/hi")
	public String getHi()
	{
		return "Hiii from App Controller";
	}
	
	@GetMapping("/bye")
	public String getBye()
	{
		return "Bye from App Controller";
	}
}
