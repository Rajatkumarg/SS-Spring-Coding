package com.rajat.beans3;

public class Laptop{
	private String brand;
	public Laptop() {
		System.out.println("LapTop object created...");
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public boolean start() {
		//some logic
		System.out.println("Laptop started...");
		return true;
	}
}
