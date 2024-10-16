package com.rajat.beans3;
public class Programmer {
	private String name;
	private Laptop lt;
	public Programmer() {
		System.out.println("Programmer object created...");
	}
	public Laptop getLt() {
		return lt;
	}
	public void setLt(Laptop lt) {
		this.lt = lt;
		System.out.println("laptop setter called...");
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void writeCode() {
		boolean res=lt.start();
		if(res) {
			System.out.println("Coding started...");
		}else {
			System.out.println("Could not write the code");
		}
	}

}

