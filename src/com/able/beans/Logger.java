package com.able.beans;

import lombok.Data;

@Data
public class Logger {
	
	private ConsoleWriter consoleWriter;
	private FileWriter fileWriter;
	
	public Logger() {
		
	}
	
	public Logger(FileWriter fileWriter, ConsoleWriter consoleWriter) {
		this.fileWriter = fileWriter;
		this.consoleWriter = consoleWriter;
	}
	
	public void writeFile(String text) {
		fileWriter.write(text);
	}
	
	public void writeConsole(String text) {
		consoleWriter.write(text);
	}

}
