package com.rajat.beans6;

public class Laptop {
	private String type;
	private String brand;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Laptop [type=" + type + ", brand=" + brand + "]";
	}
	
}
