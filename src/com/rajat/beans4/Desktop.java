package com.rajat.beans4;

public class Desktop implements Computer{
	@Override
	public boolean start() {
		//some logic
		System.out.println("DeskTop started...");
		return true;
	}

}
