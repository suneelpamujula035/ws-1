package com.example;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.example.service.EmailSenderService;

@SpringBootApplication
public class SpringbootEmailSendingApplication {

	@Autowired 
	private EmailSenderService emailSenderService; 
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootEmailSendingApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void triggerEmail()
	{
		emailSenderService.sendSimpleEmail("suneelpamujula4@gmail.com", "Hiiii friends how are you", "Suneel Springboot");
	}
	
	String emails[] = {"suneelpamujula4@gmail.com","suneelpamujula44@gmail.com"};
	@EventListener(ApplicationReadyEvent.class)
	public void triggerEmailToMultipleMails()
	{
		emailSenderService.sendSimpleEmailToMutipleMails(emails, "Hiiii friends how are you", "Testing Multiple mails");
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void triggerMailWithAttachment() throws MessagingException
	{
		emailSenderService.sendEmailWithAttachment("suneelpamujula4@gmail.com", "Hi from attachment", "SpringBoot Attachment Test");
	}
}
