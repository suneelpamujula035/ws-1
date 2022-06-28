package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentRepository studentRepo;
	@PostMapping("/save")
	public Student saveStudent(@RequestBody Student student)
	{
		return studentRepo.save(student);
	}
	
	@GetMapping("/getStudent/{name}")
	public Student getStudent(@PathVariable String name)
	{
		return studentRepo.findingStudentByName(name);
	}
	
	@GetMapping("/getAvgSalary")
	public double getAverageSalary()
	{
		return studentRepo.avgSal();
	}
}
