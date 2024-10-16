package com.rajat.beans7;

public class Emp {

	private String name;

	public Emp() {
		System.out.println("calling Emp constructor------");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setting name----------");
		this.name = name;
	}
	
	
}
