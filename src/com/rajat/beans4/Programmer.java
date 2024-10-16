package com.rajat.beans4;
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

