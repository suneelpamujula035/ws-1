package com.demo.annotations2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.demo.annotations2")
@PropertySource("classpath:institute-info.properties")
public class InstituteConfig {

}
