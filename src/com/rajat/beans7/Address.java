package com.rajat.beans7;

public class Address {

	private int houseNo;
	private String locality;
	private String city;
	Address(){
		System.out.println("Address constructor called-------------");
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", locality=" + locality + ", city=" + city + "]";
	}
	
}
