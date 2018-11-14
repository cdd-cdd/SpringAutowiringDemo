package com.able.beans;

import org.springframework.stereotype.Component;

@Component
public class FileWriter implements LogWriter {

	public void write(String text) {

		System.out.println("Write to file :" + text);
	}

}
