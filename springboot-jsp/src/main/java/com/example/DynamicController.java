package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.entity.User;

@Controller
public class DynamicController {

	
	@GetMapping("/")
	public String showDynamicTable(Model model)
	{
		User user = new User();
		model.addAttribute("user", user);
		return "add-address";
	}
	
	@GetMapping("/show")
	public String showPage()
	{
		return "home";
	}
	
	@PostMapping("/save")
	public void saveInfo(@ModelAttribute("user") User user)
	{
		System.out.println(user);
	}
}
