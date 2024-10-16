package com.rajat.beans6;

public class Programmer {
	private String name;
	private Laptop lpObj;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Laptop getLpObj() {
		return lpObj;
	}
	public void setLpObj(Laptop lpObj) {
		this.lpObj = lpObj;
	}
	@Override
	public String toString() {
		return "Programmer [name=" + name + ", lpObj=" + lpObj + "]";
	}
	
}
