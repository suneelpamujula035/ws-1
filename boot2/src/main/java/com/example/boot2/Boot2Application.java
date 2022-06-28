package com.example.boot2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example")//For scanning all packages
public class Boot2Application {

	public static void main(String[] args) {
		SpringApplication.run(Boot2Application.class, args);
		System.out.println("Hello world");
	}

}
