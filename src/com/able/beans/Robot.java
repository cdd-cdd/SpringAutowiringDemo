package com.able.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Robot {
	

	@Autowired
	@Value("#{randomText.text?.length()}")
	private String id = "default robot";
	@Autowired
	//new java.util.Date().toString()
	//T(Math).PI
	//T(Math).sin(5)
	@Value("#{T(Math).sin(T(Math).PI/4)^2 le 0.8 ? 'Yes':'No'}")
	private String speech = "hello";
	
	public void speak() {
		System.out.println(id + ":" + speech);
		
	}

}
