package com.app.security;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//This class is going to help you to create the Spring securith filter chain (GUN Man)
//@EnableWebSecurity
@EnableWebSecurity(debug = true)
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {

//	@Autowired
//	private PasswordEncoder bcryptEncoder;
	//It is used for creating some details for user
	//username, pssword, role
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.withUser("suneel")
		//.password("$2a$10$ElrdWR4wcAEJXDYGnXSGJuvxs7VbBlSPe9abgLrpys/LhdwpAjHMy")//suneel123 //For BCryptPasswordEncoder
		//.password("suneel123")//For NoOpPasswordEncoder
		.password("{bcrypt}$2a$10$ElrdWR4wcAEJXDYGnXSGJuvxs7VbBlSPe9abgLrpys/LhdwpAjHMy")//suneel123 //For BCryptPasswordEncoder without creating object
		.roles("admin");
		//System.out.println("=+=+=+=+>>>>>"+bcryptEncoder.encode("sunny789"));
	}
	
	//For basic http without any form
//	@Override
//		protected void configure(HttpSecurity http) throws Exception {
//			http
//			.authorizeRequests()
//			.anyRequest()
//			.authenticated()
//			.and()
//			.httpBasic();
//	http
//	.authorizeRequests()
//	.anyRequest()
//	.authenticated()
//	.and()
//	.formLogin()
//	.and()
//	.httpBasic();
	
//		}
	//This method is used for Encoding our password
//	@Bean
//	public PasswordEncoder getPasswordEncoder()//It is the interface
//	{
//		//NoOpPasswordEncoder is the Singleton class So we can't create object with new keyword
//		return NoOpPasswordEncoder.getInstance();//This is the implementation class for the PasswordEncoder
//	}
	
//	@Bean
//	public PasswordEncoder getPasswordEncoder()
//	{
//		return new BCryptPasswordEncoder();
//	}
}
