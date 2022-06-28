package com.example;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entity.Employee;
import com.example.entity.Project;
import com.example.repository.EmployeeRepository;
import com.example.repository.ProjectRepository;

@SpringBootApplication
public class SpringBootJpaManyToMany02Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaManyToMany02Application.class, args);
	}

//	Employee e1 = new Employee("suneel", "hyderabad");
//	Employee e2 = new Employee("pawan", "bangalore");
//	Employee e3 = new Employee("fahim", "mumbai");
//	
//	Project p1 = new Project("Library Management");
//	Project p2 = new Project("Chatbot");
//	Project p3 = new Project("Ecom website");
//	Project p4 = new Project("School Management");
//	Project p5 = new Project("Online Booking");
	@Autowired
	private EmployeeRepository employeeRepo;
	@Autowired
	private ProjectRepository projectRepo;
	
	@Override
	public void run(String... args) throws Exception {
		Employee e1 = new Employee("suneel", "hyderabad");
		Employee e2 = new Employee("pawan", "bangalore");
		
		Project p1 = new Project("Library Management");
		Project p2 = new Project("Chatbot");
		
		e1.getProjects().add(p1);
		e1.getProjects().add(p2);
		e2.getProjects().add(p1);
		
		p1.getEmployees().add(e1);
		p2.getEmployees().add(e1);
		p1.getEmployees().add(e2);
		
		employeeRepo.save(e1);
		employeeRepo.save(e2);
	}

}
