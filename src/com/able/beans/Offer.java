package com.able.beans;

import lombok.Data;

@Data
public class Offer {
	
	private int id;
	private String name;
	private String email;
	private String text;
	
	public Offer() {
		super();
	}
	
	public Offer(String name, String email, String text) {
		super();
		this.name = name;
		this.email = email;
		this.text = text;
	}

	public Offer(int id, String name, String email, String text) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.text = text;
	}



}
