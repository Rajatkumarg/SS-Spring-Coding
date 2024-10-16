package com.rajat.beans5;

//eg for circular dependency support
public class Husband {
	private String name;
	private Wife wife;
	
	public Husband() {
		
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public Wife getWife() {
		return wife;
	}
	public void setWife(Wife wife) {
		this.wife = wife;
	}
	@Override
	public String toString() {
		return "Husband [name=" + name + ", wife=" + wife + "]";
	}
	
}
