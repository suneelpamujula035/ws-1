package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
//	@GetMapping("/hi")
//	public String sayHi()
//	{
//		return "Hiiii friends How are you??";
//	}
	
	@PostMapping("/saveStudent")
	public Student saveStudent(@RequestBody Student student)
	{
		return studentService.saveStudent(student);
	}
	@GetMapping("/getStudent/{id}")
	public Student getStudent(@PathVariable long id)
	{
		return studentService.getStudentById(id);
	}
	@GetMapping("/getStudentByName/{name}")
	public Student getStudentBynameProperty(@PathVariable String name)
	{
		return studentService.getStudentByName(name);
	}
}
