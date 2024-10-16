package com.rajat.beans5;

public class Address {

	private int houseNo;
	private String locality;
	private String city;
	
	
	public Address(int houseNo, String locality, String city) {
		super();
		this.houseNo = houseNo;
		this.locality = locality;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", locality=" + locality + ", city=" + city + "]";
	}
	
}
