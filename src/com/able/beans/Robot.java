package com.able.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Robot {
	
	@Autowired
	@Value("123")
	private int id;
	@Autowired
	@Value("hello,surprise")
	private String speech;
	public void speak() {
		System.out.println(id + ":" + speech);
		
	}

}
