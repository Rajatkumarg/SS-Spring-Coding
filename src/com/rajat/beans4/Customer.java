package com.rajat.beans4;

public class Customer {
	private String name;
	private Account acc;
	public Customer() {
		System.out.println("creating Customer object...");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}

}
