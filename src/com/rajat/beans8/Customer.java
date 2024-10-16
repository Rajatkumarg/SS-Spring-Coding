package com.rajat.beans8;

public class Customer {
	private String name;
	private Account acc;

	public void setName(String name) {
		this.name = name;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}

	public void display() {
		System.out.println("Customer's name:" + name);
		System.out.println("Acctid:" + acc.getAcctId());
		System.out.println("Balance:" + acc.getBalance());
	}
}
