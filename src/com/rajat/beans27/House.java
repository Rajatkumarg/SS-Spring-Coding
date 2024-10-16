package com.rajat.beans27;

import org.springframework.stereotype.Component;

public class House {

	private String name = "InstaVilla";
	
	public House() {
		System.out.println("House created");
	}
	
	public String toString() {
		return this.name;
	}
}
