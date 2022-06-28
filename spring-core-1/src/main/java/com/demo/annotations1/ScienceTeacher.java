package com.demo.annotations1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary//If we have less number of implementations then use @Primary
public class ScienceTeacher implements Teacher {

	public void teacherInfo() {
		System.out.println("Hey this is Alex");
		System.out.println("I'm your Science Teacher");
		
	}
}
