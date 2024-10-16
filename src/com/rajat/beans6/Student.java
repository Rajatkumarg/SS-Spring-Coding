package com.rajat.beans6;

import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Student {
	private String name;
	private int roll;
	private Address address;
	private Date dob;
	public Student() {
		System.out.println("Called non parameterized constructor");
	}
	public Student(String name, int roll) {
		System.out.println("Called two parameterized constructor");
		this.name = name;
		this.roll = roll;
	}
	public Student(String name, int roll, Date dob) {
		System.out.println("Called three parameterized constructor");
		this.name = name;
		this.roll = roll;
		this.dob = dob;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", address=" + address + ", dob=" + dob + "]";
	}

}
