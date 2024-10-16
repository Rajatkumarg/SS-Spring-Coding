package com.rajat.beans7;

public class Student {
	private String name;
	private int roll;
	private Address address;
	public Student() {
		System.out.println("constructor called-----");
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
	
	public Address getAddress() {
		return this.address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", address=" + address + "]";
	}

}
