package com.rajat.beans22;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private int roll;
	private String name;
	private String[] subjects;
	private List<Character> semGrades; 
	
	public Student(@Value("${student.roll}") int roll, @Value("${student.name:guest}") String name,
			@Value("${student.subs}") String[] subjects, @Value("${grades:C,D,E}") List semGrades) {
		System.out.println("Creating Student object with property initialization...");
		this.roll = roll;
		this.name = name;
		this.subjects = subjects;
		this.semGrades = semGrades;
	}	
	public void display() {
		System.out.println("I'm a Student bean "+this);
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", subjects=" +Arrays.toString(subjects) + 
				"semGrades=" + semGrades+ "]";
	}
	
}
