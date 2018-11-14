package com.able.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Logger logger = context.getBean("logger", Logger.class);
		
		logger.writeFile("hello file");
		logger.writeConsole("hello console");
		
		
		((ClassPathXmlApplicationContext)context).close();

	}

}
