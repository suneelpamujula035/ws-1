package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SisController {

	@ResponseBody
	@RequestMapping("/book")
	public String getBook()
	{
		return "Here is your book";
	}
	
	@ResponseBody
	@RequestMapping("/bag")
	public String getBag()
	{
		return "Its brand new bag..";
	}
	
	@ResponseBody
	@RequestMapping("/gift")
	public String getGift()
	{
		return "Hey where is my gift..";
	}
}
