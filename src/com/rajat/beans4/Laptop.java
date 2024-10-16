package com.rajat.beans4;

public class Laptop implements Computer{
	@Override
	public boolean start() {
		//some logic
		System.out.println("Laptop started...");
		return true;
	}
}
