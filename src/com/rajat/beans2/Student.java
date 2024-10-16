package com.rajat.beans2;

public class Student {
	private String name;
	private int rollno;
	public Student() {
		super();
		System.out.println("Creating Student object...");
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		System.out.println("Initializing name...");
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		System.out.println("Initializing rollno...");
		this.rollno = rollno;
	}

}
