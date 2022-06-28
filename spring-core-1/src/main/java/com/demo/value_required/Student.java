package com.demo.value_required;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {

	@Value("${student.name}")
	private String name;
	@Value("${student.interestedCourse}")
	private String interestedCourse;
	@Value("${student.hobby}")
	private String hobby;
	
	public void showData()
	{
		System.out.println("My name is "+name);
		System.out.println("My intersted course is "+interestedCourse);
		System.out.println("My hobby is "+hobby);
	}
}
