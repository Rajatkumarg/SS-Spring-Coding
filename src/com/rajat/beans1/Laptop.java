package com.rajat.beans1;

public class Laptop implements Computer{
	
	public Laptop(String name) {
		System.out.println("Creating Laptop of "+name);
	}
	public boolean start() {
		//some logic
		System.out.println("Laptop started...");
		return true;
	}

}
