package com.example.boot2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/test")
	public String show() {
		return "Good morning";
	}
	
	@GetMapping("/showStudent")
	public Student getDetails() 
	{
		Student student = new Student();
		student.setRoll_no(101);
		student.setName("Girish");
		student.setAddress("Pune");
		return student;
	}
	
	@GetMapping("/showAllStudents")
	public List<Student> getListOfStudents()
	{
		Student stu1 = new Student();
		stu1.setRoll_no(1);
		stu1.setName("Hareesh");
		stu1.setAddress("Vizag");
		
		Student stu2 = new Student();
		stu2.setRoll_no(2);
		stu2.setName("Durga");
		stu2.setAddress("Hyderabad");
		
		Student stu3 = new Student();
		stu3.setRoll_no(3);
		stu3.setName("balu");
		stu3.setAddress("Chennai");
		
		Student stu4 = new Student();
		stu4.setRoll_no(4);
		stu4.setName("surya");
		stu4.setAddress("nellore");
		
		Student stu5 = new Student();
		stu5.setRoll_no(5);
		stu5.setName("fahim");
		stu5.setAddress("kolkata");
		
		Student stu6 = new Student();
		stu6.setRoll_no(6);
		stu6.setName("ganesh");
		stu6.setAddress("delhi");
		
		Student stu7 = new Student();
		stu7.setRoll_no(7);
		stu7.setName("surya");
		stu7.setAddress("europe");
		
		List<Student> studentsList = new ArrayList();
		studentsList.add(stu1);
		studentsList.add(stu2);
		studentsList.add(stu3);
		studentsList.add(stu4);
		studentsList.add(stu5);
		studentsList.add(stu6);
		studentsList.add(stu7);
		return studentsList;
	}
}
