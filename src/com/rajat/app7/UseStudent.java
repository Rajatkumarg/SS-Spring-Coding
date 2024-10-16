package com.rajat.app7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rajat.beans7.Address;
import com.rajat.beans7.Student;

public class UseStudent {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/rajat/resources/beanconf8_0.xml");
		// Singleton scope - bidefault
		Student obj1 = context.getBean("stdObj", Student.class);
		Student obj2 = context.getBean("stdObj", Student.class);
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj1 == obj2);
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		// After changing property value
		obj1.setName("Nishant");
		obj2.setRoll(2);
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj1 == obj2);
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());

		// Prototype scope
		System.out.println("-----------------------------------");
		obj1 = context.getBean("stdObj2", Student.class);
		obj2 = context.getBean("stdObj2", Student.class);
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj1 == obj2);
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		// After changing property value
		obj1.setName("Khushi");
		obj2.setRoll(6);
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj1 == obj2);
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());

		// Using prototype scoped bean inside singleton scoped bean
		System.out.println("-----------------------------------");
		obj1 = context.getBean("stdObj3", Student.class);
		obj2 = context.getBean("stdObj3", Student.class);
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj1 == obj2);
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		// After changing property value
		obj1.setName("Khushi");
		obj2.setRoll(6);
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj1 == obj2);
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		// After changing address property value
		obj1.getAddress().setCity("Dumraon");
		obj2.getAddress().setHouseNo(60);
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj1 == obj2);
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj1.getAddress().hashCode());
		System.out.println(obj2.getAddress().hashCode());

		Address address1 = obj1.getAddress();
		Address address2 = obj2.getAddress();
		System.out.println(address1);
		System.out.println(address2);
		// since we are fetching address from student bean. It will behaves as singleton only
		System.out.println(address1.hashCode());
		System.out.println(address2.hashCode());

		address1 = context.getBean("addrObj", Address.class);
		address2 = context.getBean("addrObj", Address.class);
		// now address behaves as prototype bcz now we are fetching it directly using getBean
		System.out.println(address1.hashCode());
		System.out.println(address2.hashCode());
		
		//Lazy initialization
		System.out.println("----------------------------");
//		Student obj4 = context.getBean("stdObj4", Student.class);
	}
}
