package com.rajat.beans11;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Laptop implements InitializingBean, DisposableBean{
	private String model;
	@Override
	public void destroy() throws Exception {//destroy
		System.out.println("Laptop closed");
	}

	@Override
	public void afterPropertiesSet() throws Exception {//init
		System.out.println("Laptop started");
	}
	
	public Laptop() {
		System.out.println("Laptop constructor called");
	}
	public void setModel(String model) {
		System.out.println("Laptop setter called");
		this.model = model;
	}
	public void startCoding() {
		System.out.println("Coding started");
	}
}
