//package com.example.controller;
//
//import java.io.IOException;
//
//import javax.mail.MessagingException;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.entity.EmailRequest;
//import com.example.service.EmailSenderService;
//
//@RestController
//public class EmailController {
//
//	@Autowired 
//	private EmailSenderService emailSenderService; 
//	
//	@PostMapping("/send")
//	public void triggerMailWithAttachment(@RequestBody EmailRequest request) throws MessagingException, IOException
//	{
//		emailSenderService.sendEmailWithAttachment(request.getTo(), request.getBody(), request.getSubject());
//	}
//}
