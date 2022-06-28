package com.demo.annotations1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

////@Component("collegeBean")
@Component//If we not mention the bean name it takes bean name as class name
public class College {

	@Value("${college.collegeName}")
	private String collegeName;
	@Autowired
	private Principal principal;
	@Autowired
	@Qualifier("mathsTeacher")
	private Teacher teacher;
	
//	public College(Principal principal) {
//		super();
//		this.principal = principal;
//	}
	
//	public void setPrincipal(Principal principal) {
//		this.principal = principal;
//	}

	
	public void test()
	{
		System.out.println("My college name is : "+collegeName);
		principal.principalInfo();
		teacher.teacherInfo();
		System.out.println("College bean is working");
	}

	
}
