package com.rajat.beans28;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class Person {

	private String name;
    private Car car;
	
	@Autowired
	public Person(Car car, String name) {
		System.out.println("Parameterised Person constructor called");
		this.car = car;
		this.name = name;
	}
	
	public String toString() {
		return "Name is "+name+" Car is "+car.carName();
	}
}
