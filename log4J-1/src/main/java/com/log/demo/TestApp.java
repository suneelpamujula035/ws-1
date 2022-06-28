package com.log.demo;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.xml.XMLLayout;

public class TestApp {

	//3.Create Logger object
	private static Logger log = Logger.getLogger(TestApp.class);
	public static void main(String[] args) throws IOException {
		//1. Create Layout
//		Layout layout = new SimpleLayout();
//		Layout layout = new HTMLLayout();
//		Layout layout = new XMLLayout();
		Layout layout = new PatternLayout("%d %C %M %m %n");//%date %time %class %method %message
		//2. Create Applender + link layout
		Appender app = new ConsoleAppender(layout);
//		Appender app = new FileAppender(layout,"D:\\user\\data\\data.log");
		//4. Link appender with logger
		log.addAppender(app);
		
		//Print messages
		log.info("FROM INFO");
		log.debug("FROM DEBUG");
		log.fatal("FROM FATAL");
		log.error("FROM ERROR");
		log.warn("FROM WARN");
	}

}
