package com.rajat.beans28;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Car {

	private String name;
	
	public Car(String name) {
		System.out.println("Car Created");
		this.name = name;
	}
	
	public String carName() {
		return this.name;
	}
}
