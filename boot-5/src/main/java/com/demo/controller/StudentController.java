package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Student;

@RestController
public class StudentController {

	@GetMapping("/student")
	public Student getStudent()
	{
		Student student = new Student();
		student.setId(101);
		student.setName("Jagadheesh");
		student.setAddress("Vizag");
		return student;
	}
}
