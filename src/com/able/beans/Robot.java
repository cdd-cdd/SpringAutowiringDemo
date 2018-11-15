package com.able.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Robot {
	


	private String id = "default robot";
	private String speech = "hello";
	
	public void speak() {
		System.out.println(id + ":" + speech);
		
	}

}
