package com.rajat.beans23;

public class Student {
	
	private int roll;
	private String name; 
	
	public Student(int roll, String name) {
		System.out.println("Creating Student object with property initialization...");
		this.roll = roll;
		this.name = name;
	}	
	public void display() {
		System.out.println("I'm a Student bean "+this);
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}
	
}
