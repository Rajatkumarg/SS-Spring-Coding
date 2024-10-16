package com.rajat.app11;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rajat.beans11.Cycle;

public class UseCycle {
public static void main(String[] args) {
	ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("/com/rajat/resources/beanconf11.xml");
    Cycle cycle = container.getBean("cycleObj", Cycle.class);
	cycle.drive();
	container.close();//here for prototype object, for destroy, we have to do it using @PreDestroy or implementing Disposable but not using destroy-method in xml
}
}
