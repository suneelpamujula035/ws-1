package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.api.Student;
import com.demo.dao.StudentDAO;
import com.demo.dao.StudentDAOImpl;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		StudentDAO s = context.getBean("studentDAOImpl", StudentDAOImpl.class);
		
		Student s1 = new Student();
		s1.setRoll_no(3);
		s1.setName("naresh");
		s1.setAddress("Hyderabad");
		
		s.insert(s1);
	}

}
