package com.rajat.app3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rajat.beans3.Laptop;
import com.rajat.beans3.Programmer;

public class UseProgrammer {
public static void main(String[] args) {

	ApplicationContext context=new ClassPathXmlApplicationContext("/com/rajat/resources/beanconf2.xml");
	Programmer p=context.getBean(Programmer.class);
	System.out.println("Programmer's name:"+p.getName());
	System.out.println("Programmer's LapTop brand:"+p.getLt().getBrand());
	p.writeCode();

}
}
