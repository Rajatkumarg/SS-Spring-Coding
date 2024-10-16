package com.rajat.beans13;

import org.springframework.stereotype.Component;

@Component("mycar")
public class Car {
	public Car() {
		System.out.println("Creating Car object...");
	}
	public void display() {
		System.out.println("I'm a Car bean");
	}

}
