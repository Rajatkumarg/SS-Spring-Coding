package com.rajat.beans1;

public class Desktop implements Computer{
	public Desktop(String name) {
		System.out.println("Creating Desktop of "+name);
	}
	public boolean start() {
		//some logic
		System.out.println("Desktop started...");
		return true;
	}
}
