package com.app.security;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity(debug = true)
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {

	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
		.inMemoryAuthentication()
		.withUser("suneel").password("{bcrypt}$2a$10$ElrdWR4wcAEJXDYGnXSGJuvxs7VbBlSPe9abgLrpys/LhdwpAjHMy").roles("admin")
		.and()
		.withUser("naresh").password("{bcrypt}$2a$10$htMzNYy5SZnWbhOb45.s/.L20IOkIZr34L6rFU6zcBOMPjw8UlSZu").roles("user")
		.and()
		.withUser("santhosh").password("{bcrypt}$2a$10$CAE2mTFAzypWinS4o5UYQuaxXU6SxNcNpfc4Kchb54FdGnbPDBUIW").roles("user");
	}

//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http
//		.authorizeRequests()
//		.antMatchers("/hi","/bye").authenticated()
//		.antMatchers("/home","/getName").permitAll()
//		.and()
//		.formLogin().loginPage("/myCustomLogin")
//		.and()
//		.httpBasic();
//	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests()
		.antMatchers("/hi","/bye","/home").authenticated()
		.antMatchers("/getName").permitAll()
		.and()
		.formLogin().loginPage("/myCustomLogin").loginProcessingUrl("/process-login")
		.and()
		.httpBasic()
		.and()
		.logout();
	}
}
