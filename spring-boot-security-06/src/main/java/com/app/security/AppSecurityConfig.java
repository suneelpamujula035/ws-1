package com.app.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity(debug = true)
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource dataSource;//Creating DataSource object
	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
		.jdbcAuthentication()
		.dataSource(dataSource)
		.passwordEncoder(new BCryptPasswordEncoder());
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests()
		.antMatchers("/").authenticated()
		.antMatchers("/admin").hasAuthority("admin")
		.antMatchers("/user").hasAuthority("user")
		.and()
		.formLogin().loginPage("/myCustomLogin").loginProcessingUrl("/process-login").permitAll()
		.and()
		.httpBasic()
		.and()
		.logout().permitAll()
		.and()
		.exceptionHandling().accessDeniedPage("/accessDenied");
	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder()
	{
		return new BCryptPasswordEncoder();
	}
}
