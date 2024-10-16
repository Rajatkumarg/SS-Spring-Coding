package com.rajat.beans26;

import org.springframework.stereotype.Component;

@Component
public class House {

	private String name = "InstaVilla";
	
	public House() {
		System.out.println("House created");
	}
	
	public String toString() {
		return this.name;
	}
}
