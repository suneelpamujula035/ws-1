package com.demo.annotations2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Institute {

	@Value("${institute.instituteName}")
	private String instituteName;

	@Autowired
	@Qualifier("pythonProfessor")
	private Professor professor;
	
	public void instituteInfo()
	{
		System.out.println("My institute name is : "+instituteName);
		professor.professorInfo();
	}
}
