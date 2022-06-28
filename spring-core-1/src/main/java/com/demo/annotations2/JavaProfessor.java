package com.demo.annotations2;

import org.springframework.stereotype.Component;

@Component
public class JavaProfessor implements Professor{

	public void professorInfo() {
		System.out.println("Hey this is Mark");
		System.out.println("I'm your Java Professor");
		
	}
	

}
