package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {

//	@Bean
//	@Override
//	protected UserDetailsService userDetailsService() {
//		ArrayList<UserDetails> users = new ArrayList<>();
//		users.add(User.withDefaultPasswordEncoder().username("sunny").password("sunny123").roles("USER").build());
//		return new InMemoryUserDetailsManager(users);
//	}
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.withUser("sunny")
		//.password("suneel444")
		.password("$2a$10$KwqbfBPjAzQaZfR34aLU1..gbcDnT2/w2PRSiT3KjhAKvlX3cOCTW")//sunny123
		.roles("user");
	}
	
//	@Bean
//	public PasswordEncoder getPasswordEncoder()
//	{
//		return NoOpPasswordEncoder.getInstance();
//	}
	@Bean
	public PasswordEncoder getPasswordEncoder()
	{
		return new BCryptPasswordEncoder();
	}
}
