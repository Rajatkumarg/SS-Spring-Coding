package com.rajat.app11;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rajat.beans11.Laptop;

public class UseLaptop {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("/com/rajat/resources/beanconf11.xml");
		Laptop laptop = container.getBean("laptopObj", Laptop.class);
		laptop.startCoding();
		container.close();
	}
}
