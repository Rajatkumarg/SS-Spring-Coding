package com.rajat.beans11;

public class Cycle {
	private String model;
	public Cycle() {
		System.out.println("Cycle object created...");
	}
	public void setModel(String model) {
		this.model = model;
		System.out.println("Setter called for Cycle model...");
	}
	public void startCycle() {//init method
		System.out.println("Cycle started...");
	}
	public void drive() {
		System.out.println("Cycle is getting driven...");
	}
	public void stopCycle() {//destroy method
		System.out.println("Cycle stopped...");
	}
}
