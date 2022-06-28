package com.demo.beanlifecycle;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

//		ApplicationContext context = new AnnotationConfigApplicationContext(StudentDAOConfig.class);
//		StudentDAO s = context.getBean("studentDAO", StudentDAO.class);
//		s.getStudents();
//		s.deleteStudent(3);
		
		StudentDAO s = new StudentDAO();
		s.getStudents();
	}

}
