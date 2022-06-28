package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entity.Address;
import com.example.entity.Employee;
import com.example.repository.AddressRepository;
import com.example.repository.EmployeeRepository;

@SpringBootApplication
public class SpringBootJpaOneToMany01Application{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaOneToMany01Application.class, args);
	}

//	@Autowired
//	private EmployeeRepository employeeRepo;
//	@Autowired
//	private AddressRepository addressRepo;
//	@Override
//	public void run(String... args) throws Exception {
//		
//		List<Address> listOfAddress = new ArrayList<>();
//		Address address1 = new Address("R.R PG", "Bangalore", "India");
//		Address address2 = new Address("Seshadri Enclove", "Mumbai", "India");
//		Address address3 = new Address("Suresh Homes", "Goa", "India");
//		listOfAddress.add(address1);
//		listOfAddress.add(address2);
//		listOfAddress.add(address3);
//		
//		Employee employee = new Employee();
//		employee.setName("Pawan");
//		employee.setDesignation("Software Engineer");
//		employee.setAddresses(listOfAddress);
//		
//		employeeRepo.save(employee);
//		
//	}

}
