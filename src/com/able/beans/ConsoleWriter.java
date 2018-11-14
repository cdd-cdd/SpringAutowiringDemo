package com.able.beans;

import org.springframework.stereotype.Component;

@Component
public class ConsoleWriter implements LogWriter {
	
	public void write(String text) {

		System.out.println("Write to console :" + text);
	}

}
