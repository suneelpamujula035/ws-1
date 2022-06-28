package com.example;

import com.example.dto.MailRequest;
import com.example.dto.MailResponse;
import com.example.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class SpringbootEmailFreemarkerApplication {

	@Autowired
	private EmailService service;

	@PostMapping("/sendingEmail")
	public MailResponse sendEmail(@RequestBody MailRequest request) {
		Map<String, Object> model = new HashMap<>();
		model.put("Name", request.getName());
		model.put("location", "Bangalore,India");
		return service.sendEmail(request, model);

	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootEmailFreemarkerApplication.class, args);
	}

}
