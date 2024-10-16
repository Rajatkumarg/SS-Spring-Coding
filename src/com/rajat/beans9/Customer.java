package com.rajat.beans9;

public class Customer {
	private String name;
	private Account acc;

	public void setName(String name) {
		this.name = name;
	}

	public Customer(Account myacc) {
		this.acc=myacc;
		System.out.println("Customer const called");
	}

	public void display() {
		System.out.println("Customer's name:" + name);
		System.out.println("Acctid:" + acc.getAcctId());
		System.out.println("Balance:" + acc.getBalance());
	}
}
