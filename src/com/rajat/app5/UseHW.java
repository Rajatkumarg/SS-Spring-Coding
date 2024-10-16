package com.rajat.app5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rajat.beans5.Emp;
import com.rajat.beans5.Husband;
import com.rajat.beans5.Wife;
public class UseHW {
	public static void main(String[] args) {
		//eg for circular dependency support
		ApplicationContext container=new ClassPathXmlApplicationContext("/com/rajat/resources/beanconf6.xml");
		Husband hb = container.getBean(Husband.class);
		Wife wf = container.getBean(Wife.class);
		System.out.println(hb.getName());
		System.out.println(hb.getWife().getName());
		System.out.println(wf.getName());
		System.out.println(wf.getHusband().getName());
	}

}
