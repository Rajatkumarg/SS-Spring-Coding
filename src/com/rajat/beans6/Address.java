package com.rajat.beans6;

public class Address {

	private int houseNo;
	private String locality;
	private String city;
	
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
