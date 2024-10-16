package com.rajat.beans25;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private int roll;
	private String name;
	private String[] subjects;
	private List<Character> semGrades;
	private LinkedList<String> cities;
	private Map<String, Integer> scoreMap;
	
	public Student(@Value("${student.roll}") int roll, @Value("${student.name:guest}") String name,
			@Value("${student.subs}") String[] subjects, @Value("${grades:C,D,E}") List semGrades,
			@Value("#{new java.util.LinkedList(T(java.util.Arrays).asList('${student.cities}'))}") LinkedList<String> cities,
			@Value("#{${students.scores}}") Map<String, Integer> scoreMap) {
		System.out.println("Creating Student object with property initialization...");
		this.roll = roll;
		this.name = name;
		this.subjects = subjects;
		this.semGrades = semGrades;
		this.scoreMap = scoreMap;
		this.cities = cities;
	}	
	
	public void display() {
		System.out.println("I'm a Student bean "+this);
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", subjects=" + Arrays.toString(subjects) + ", semGrades="
				+ semGrades + ", cities=" + cities + ", scoreMap=" + scoreMap + "]";
	}
	
}
