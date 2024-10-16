package com.rajat.beans1;
//Remove dependency using setter injection
public class Programmer {
	private Computer comp;
	public Computer getComp() {
		return comp;
	}
	public void setComp(Computer comp) {
		this.comp = comp;
	}
	public void writeCode() {
		boolean res=comp.start();
		if(res) {
				System.out.println("Coding started...");
		}else {
				System.out.println("Could not write the code");
		}
	}
}


//Remove dependency using constructor injection
/*
public class Programmer {
	private Computer comp;
	public Programmer(Computer comp) {
		this.comp=comp;
	}
	public void writeCode() {
		boolean res=comp.start();
		if(res) {
				System.out.println("Coding started...");
		}else {
				System.out.println("Could not write the code");
		}
	}
}
/*

//Dependency using Composition
/*
public class Programmer{
	private Laptop laptop;
	public void writeCode() {
		laptop = new Laptop();
		boolean res = laptop.start();
		if(res) {
		System.out.println("Coding started...");
		}else {
		System.out.println("Could not write the code");
		}
	}
}
/*

//Dependency using inheritance
/*
public class Programmer extends Laptop{
	public void writeCode() {
		boolean res=super.start();
		if(res) {
		System.out.println("Coding started...");
		}else {
		System.out.println("Could not write the code");
		}
	}
}
*/
