package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CafeController {

	@RequestMapping("/welcome")
	public String welcomePage(Model model)
	{
		String name = "Ashik Restaurant";
		
		model.addAttribute("restaurantName", name);
		return "welcome-page";
	}
	
	
	@RequestMapping("/orderPlaced")
	public String orderReceivedPage(HttpServletRequest request, Model mode)
	{
		String foodName = request.getParameter("foodname");
		mode.addAttribute("foodItemName", foodName);
		return "order-received";
	}
}
