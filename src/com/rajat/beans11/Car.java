package com.rajat.beans11;

public class Car {
	private String model;
	public Car() {
		System.out.println("Car object created...");
	}
	public void setModel(String model) {
		this.model = model;
		System.out.println("Setter called for model...");
	}
	public void startCar() {//init method
		System.out.println("Car started...");
	}
	public void drive() {
		System.out.println("Car is getting driven...");
	}
	public void stopCar() {//destroy method
		System.out.println("Car stopped...");
	}

}
