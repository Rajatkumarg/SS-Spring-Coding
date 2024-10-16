package com.rajat.beans5;

//eg for circular dependency support
public class Wife {
	private String name;
	private Husband husband;
	
	public Wife() {
		
	}
	public String getName() {
		return name;
	}
	public Husband getHusband() {
		return husband;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHusband(Husband husband) {
		this.husband = husband;
	}

	@Override
	public String toString() {
		return "Wife [name=" + name + ", husband=" + husband + "]";
	}
	
}
