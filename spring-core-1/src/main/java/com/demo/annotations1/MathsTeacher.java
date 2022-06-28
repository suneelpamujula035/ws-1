package com.demo.annotations1;

import org.springframework.stereotype.Component;

@Component
public class MathsTeacher implements Teacher{

	public void teacherInfo() {
		System.out.println("Hey this is John");
		System.out.println("I'm your Maths Teacher");
		
	}
	

}
