package com.rajat.beans29;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Student {

	private String name;
	private int roll;
	
	public Student() {
		System.out.println("Student obj created");
	}
	
	@Value("10")
	public void setRoll(int roll) {
		System.out.println("Initializing Roll");
		this.roll = roll;
	}
	
	@Value("RK")
	public void setName(String name) {
		System.out.println("Initializing Name");
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + "]";
	}
	
}
