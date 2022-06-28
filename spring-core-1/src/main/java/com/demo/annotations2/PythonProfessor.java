package com.demo.annotations2;

import org.springframework.stereotype.Component;

@Component
public class PythonProfessor implements Professor{

	public void professorInfo() {
		System.out.println("Hey this is Jane");
		System.out.println("I'm your Python Professor");
		
	}
}
