package com.rajat.beans26;

import org.springframework.stereotype.Component;

@Component
public class Mobile {

	private String name = "Motorola";
	
	public String toString() {
		return this.name;
	}
}
