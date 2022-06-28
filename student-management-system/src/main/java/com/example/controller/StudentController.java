package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.entity.Student;
import com.example.service.StudentService;


@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/showStudent")
	public String showStudentList(Model model) {
		// call the DAO object to get the data
		// List<Student> studentList = studentDAO.loadStudents();

		// call the service object to get the data
		List<Student> studentList = studentService.loadStudents();
		model.addAttribute("students", studentList);

//		for(Student temStudent:studentList)
//		{
//			System.out.println(temStudent);
//		}
		return "student-list";
	}

	@GetMapping("/showAddStudentPage")
	public String addStudent(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "add-student";
	}

	@PostMapping("/save-student")
	public String saveStudent(Student student) {
		//do a condition check
		//If the user doesn't have an id then do a insert
		//If the  user does have an id -> do a update
		if(student.getId() == 0)
		{
			//insert a new record
			studentService.saveStudent(student);
		}
		else
		{
			studentService.updateStudent(student);
		}
		
		
		// do DAO call to save the data
		//System.out.println(student);
		// studentDAO.saveStudent(student);

		// call service to save the date
		//studentService.saveStudent(student);
		return "redirect:/showStudent";
	}

	@GetMapping("/updateStudent")
	public String updateStudent(@RequestParam("userId") int id, Model model) {
//		Student myStudent = new Student();
//		model.addAttribute("student", myStudent);

		// we should give the user object who clicked on the update button
		System.out.println("Looking data for the student id : " + id);
		Student theStudent = studentService.getStudent(id);// Providing id to the getStudent page
		System.out.println(theStudent);
		
		//setting the student information to the updateStudentPage
//		student.setId(theStudent.getId());
//		student.setName(theStudent.getName());
//		student.setMobile(theStudent.getMobile());
//		student.setCountry(theStudent.getCountry());
		model.addAttribute("student", theStudent);
		

		return "add-student";
	}
	
	@GetMapping("/deleteStudent")
	public String deleteStudent(@RequestParam("userId") int id) {
		
		//capture the id of the student whoome you are trying to delete
		//once captured the id, do a service call to delete the student
		
		studentService.deleteStudent(id);

		return "redirect:/showStudent";
	}

}
