package com.demo.annotations1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.demo.annotations")
@PropertySource("classpath:college-info.properties")
public class CollegeConfig {

//	@Bean
//	public Principal principalBean()
//	{
//		return new Principal();
//	}
//	
//	@Bean(name = "colBean")
//	public College collegeBean()// collegeBean - bean id
//	{
//		College college = new College();
//		college.setPrincipal(principalBean());
//		return college;
//	}
}
