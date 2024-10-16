package com.rajat.beans29;

public class Employee {

	private int empId;
	private String name;
	
	public Employee(int empId, String name) {
		System.out.println("Creating employee obj");
		this.name = name;
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}
	
}
