package com.rajat.beans5;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Student {
	private String name;
	private int roll;
	private Address addr;
	public Student(String name) {
		this.name = name;
		System.out.println("Creating Student object..."+name);
	}
	public Student(int roll) {
		this.roll = roll;
		System.out.println("Creating Student object..."+roll);
	}
	public Student(int roll, String name) {
		this.roll = roll;
		this.name = name;
		System.out.println("Creating Student object with two parameter..."+roll+" "+name);
	}
	
	public Student(String name, int roll, Address addr) {
		super();
		this.name = name;
		this.roll = roll;
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", addr=" + addr + "]";
	}

}
