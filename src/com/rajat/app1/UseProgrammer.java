package com.rajat.app1;

import java.lang.reflect.Field;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rajat.beans1.Desktop;
import com.rajat.beans1.Laptop;
import com.rajat.beans1.Programmer;

public class UseProgrammer {
	public static void main(String[] args){
		
		//Remove dependency using setter injection
		System.out.println("Programmmer 1:");
		Programmer p1=new Programmer();
		p1.setComp(new Laptop("Dell"));
		p1.writeCode();
		System.out.println("=======================");
		System.out.println("Programmer 2:");
		Programmer p2=new Programmer();
		p2.setComp(new Desktop("HP"));
		p2.writeCode();

		
		//Remove dependency using constructor injection
		/*
		System.out.println("Programmmer 1:");
		Programmer p1=new Programmer(new Laptop("Dell"));
		p1.writeCode();
		System.out.println("=======================");
		System.out.println("Programmer 2:");
		Programmer p2=new Programmer(new Desktop("HP"));
		p2.writeCode();
		 */
		
		//Remove dependency using Field injection - Not used and not recommended
		/*
		Class clz=Class.forName("com.rajat.beans.Programmer");
		Object obj=clz.newInstance();
		Programmer p11=(Programmer)obj;
		
		Field compField=clz.getDeclaredField("comp");
		compField.setAccessible(true);
		compField.set(p11,new Laptop("Dell"));
		
		p11.writeCode();
		*/
		
		/*
		Programmer p=new Programmer();
		p.writeCode();
		*/
	}

}
