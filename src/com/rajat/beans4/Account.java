package com.rajat.beans4;

public class Account {
	private String acctId;
	private double balance;

	public Account() {
		System.out.println("creating Account object...");
	}

	public String getAcctId() {
		return acctId;
	}

	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
