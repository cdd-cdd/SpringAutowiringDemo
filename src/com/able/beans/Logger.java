package com.able.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Logger {

	// @Autowired
	// @Qualifier("toconsole")
	//@Resource
	@Inject
	private ConsoleWriter consoleWriter;
	// @Autowired
	//@Resource
	@Inject
	@Named(value="fileWriter")
	private LogWriter fileWriter;

	public Logger() {

	}

	// @Autowired
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

	@PostConstruct
	public void init() {
		System.out.println("init");
 
	}

	@PreDestroy
	public void destroy() {
		System.out.println("destroy");

	}

}
