package com.example.boot2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	
	//http://localhost:8080/employee/82
	@GetMapping("/employee/{id}")//In this method mandatory to pass the path variable in url
	public String getEmployee(@PathVariable int id)
	{
		System.out.println("Employee id is : "+id);
		return "Employee id is : "+id;
	}
	
	
	//http://localhost:8080/student?id=56
	@GetMapping("/student")//In this method optional to pass the parameters
	public String getStudent(@RequestParam(name = "idd",required = false,defaultValue = "444") int id)
	{
		System.out.println("Student id is : "+id);
		return "Student id is : "+id;
	}
}
