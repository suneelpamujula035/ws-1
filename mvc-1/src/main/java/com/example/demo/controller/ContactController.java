package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.ContactDTO;

@Controller
public class ContactController {

//	@RequestMapping("/contactUs")
//	public String getContactUsPage(Model model)
//	{
//		//For sending ContactDTO static values to the view
//		ContactDTO contact = new ContactDTO();
//		model.addAttribute("contactinfo", contact);
//		return "contactus-page";
//	}
	
//	@RequestMapping("/contactUsSuccessPage")
//	public String getContactUsSuccessPage(@RequestParam("name") String name1, @RequestParam("number") String number1, @RequestParam("email") String email1, Model model)
//	{
//		model.addAttribute("name2", name1);
//		model.addAttribute("number2", number1);
//		model.addAttribute("email2", email1);
//		return "contactus-success-page";
//	}
	
	@RequestMapping("/contactUs")
	public String getContactUsPage(@ModelAttribute("contactinfo") ContactDTO contactDTO)
	{
		return "contactus-page";
	}
	
	@RequestMapping("/contactUsSuccessPage")
	public String getContactUsSuccessPage(ContactDTO contactDTO, Model model)
	{
		System.out.println("Name : "+contactDTO.getName());
		System.out.println("Number : "+contactDTO.getNumber());
		System.out.println("Email : "+contactDTO.getEmail());
		model.addAttribute("contactInfo", contactDTO);
		return "contactus-success-page";
	}
}
