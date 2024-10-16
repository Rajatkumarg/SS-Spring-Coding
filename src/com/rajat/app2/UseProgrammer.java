package com.rajat.app2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rajat.beans2.Laptop;
import com.rajat.beans2.Programmer;

public class UseProgrammer {
public static void main(String[] args) {

	ApplicationContext container=new ClassPathXmlApplicationContext("/com/rajat/resources/beanconf.xml");
	Programmer p=container.getBean(Programmer.class);
	Laptop lp=container.getBean(Laptop.class);
	System.out.println("Programmer's name:"+p.getName());
	System.out.println("LapTop's brand:"+lp.getBrand());
}
}
