package com.rajat.beans26;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Value("Audi")
	private String name;
	
	public Car() {
		System.out.println("Car Created");
	}
	
	public String carName() {
		return this.name;
	}
}
