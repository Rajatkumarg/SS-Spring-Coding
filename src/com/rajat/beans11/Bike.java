package com.rajat.beans11;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Bike {
	private String model;
	public Bike() {
		System.out.println("Bike object created...");
	}
	public void setModel(String model) {
		this.model = model;
		System.out.println("Setter called for Bike model...");
	}
	
	@PostConstruct
	public void startBike() {//init method
		System.out.println("Bike started...");
	}
	public void drive() {
		System.out.println("Bike is getting driven...");
	}
	@PreDestroy
	public void stopBike() {//destroy method
		System.out.println("Bike stopped...");
	}
}
