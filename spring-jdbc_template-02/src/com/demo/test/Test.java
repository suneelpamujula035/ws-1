package com.demo.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.api.Student;
import com.demo.dao.StudentDAO;
import com.demo.dao.StudentDAOImpl;
import com.demo.helper.StudentDAOHelper;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		StudentDAO s = context.getBean("studentDAOImpl", StudentDAOImpl.class);
		StudentDAOHelper h = context.getBean("studentDAOHelper", StudentDAOHelper.class);
		s.cleanUp();
		h.addListOfStudents();
		List<Student> listOfStudents = s.findAllStudents();
		for(Student temp : listOfStudents)
		{
			System.out.println(temp);
		}
		System.out.println("For finding student by id 3: ");
		System.out.println(s.findStudentById(3));
		System.out.println(s.deleteStudentById(2));
		System.out.println("Updated student for id 5  ");
		
		System.out.println("--------------------------------");
		List<Student> findStudentByName = s.findStudentByName("surya");
		for(Student data : findStudentByName)
		{
			System.out.println(data);
		}
		System.out.println("****************************");
		Student student = new Student();
		student.setAddress("Italy");
		student.setRoll_no(3);
		int updateStudentById = s.updateStudentById(student);
		System.out.println("Number of updated records : "+updateStudentById);
		
	}

}
