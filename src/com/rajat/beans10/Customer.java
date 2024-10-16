package com.rajat.beans10;

public class Customer {
	private String name;
	private int age;
	private Account acc;
	private Address addr;

	public Customer(String name, int age, Account acc, Address addr) {
		this.name = name;
		this.age = age;
		this.acc = acc;
		this.addr = addr;
	}

	public void display() {
		System.out.println("Customer's name:" + name);
		System.out.println("Customer's age:" + age);
		System.out.println("Acctid:" + acc.getAcctId());
		System.out.println("Balance:" + acc.getBalance());
		System.out.println("House No:" + addr.getHouseNo());
		System.out.println("City:" + addr.getCity());
	}
}
