package com.example.demo.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {

		Class arr[] = {AppConfig.class};
		return arr;
	}

	@Override
	protected String[] getServletMappings() {

//		String arr[] = {"/home.com/*"};//for requests with this URL
		String arr[] = {"/"};//for any request
		return arr;
	}

}
