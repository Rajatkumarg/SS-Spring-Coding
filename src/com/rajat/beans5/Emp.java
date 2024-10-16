package com.rajat.beans5;

public class Emp {
	private String name;
	private String designation;
	private float salary;

	public Emp(String designation, float salary) {
		this.designation = designation;
		this.salary = salary;
		System.out.println("Emp object created using str-float constructor");
	}

	public Emp(float salary, String name) {
		this.salary = salary;
		this.name = name;
		System.out.println("Emp object created using float-str constructor");
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
	}

	

}
