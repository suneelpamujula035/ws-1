package com.example.filtercontroller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilterController {

	@GetMapping("/filter")
	public UserCredentials getUserCredentials()
	{
		return new UserCredentials(101, "suneel", "suneel@123", "suneel@gmail.com");
	}
	
	@GetMapping("/listfilter")
	public List<UserCredentials> getUsersListCredentials()
	{
		return Arrays.asList(new UserCredentials(101, "suneel", "suneel@123", "suneel@gmail.com"),
				new UserCredentials(102, "prathap", "prathap23", "prathap@gmail.com")
				);
	}
}
