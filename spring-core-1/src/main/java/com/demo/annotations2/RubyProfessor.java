package com.demo.annotations2;

import org.springframework.stereotype.Component;

@Component
public class RubyProfessor implements Professor {

	public void professorInfo() {
		System.out.println("Hey this is Jack");
		System.out.println("I'm your Ruby Professor");
		
	}
}
