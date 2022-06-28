package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.dao.SignupDao;
import com.app.dto.SignupDto;

@Controller
public class LoginController {

	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private SignupDao signupDao;
	
	@GetMapping("/myCustomLogin")
	public String customLogin()
	{
		return "login";
	}
	
	@GetMapping("/signup")
	public String signup(@ModelAttribute("signupDto") SignupDto signupDto)
	{
		return "signup";
	}
	
	@PostMapping("/process-signup")
	public String processSignup(SignupDto signupDto)
	{
		//before encoding
		System.out.println(signupDto);
		String encodedPassword = passwordEncoder.encode(signupDto.getPassword());
		signupDto.setPassword(encodedPassword);
		//after encoding
		System.out.println(signupDto);
		
		//save the DTO object to DB : do DB call
		signupDao.saveUser(signupDto);
		
		return "redirect:/myCustomLogin";
	}
	
}
