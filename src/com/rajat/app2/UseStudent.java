package com.rajat.app2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rajat.beans2.Student;


public class UseStudent {
	public static void main(String[] args) {

		//Using ApplicationContext
		ApplicationContext container=new ClassPathXmlApplicationContext("/com/rajat/resources/beanconf.xml");
		System.out.println("\n");
		System.out.println("First bean");
		System.out.println("==============");
		Student st1=(Student)container.getBean("stdObj1"); 
		System.out.println("Name:"+st1.getName());
		System.out.println("Roll no:"+st1.getRollno());
		Student st2=(Student)container.getBean("stdObj2"); 
		System.out.println("\n");
		System.out.println("Second bean");
		System.out.println("==============");
		System.out.println("Name:"+st2.getName());
		System.out.println("Roll no:"+st2.getRollno());
		Student st3=(Student)container.getBean("stdObj3"); 
		System.out.println("\n");
		System.out.println("Third bean");
		System.out.println("==============");
		System.out.println("Name:"+st3.getName());
		System.out.println("Roll no:"+st3.getRollno());
		System.out.println(((Student)container.getBean("stdObj4")).getName());
		System.out.println(((Student)container.getBean("stdObj5")).getRollno());
		
		//Using ApplicationContext
		/*
		ApplicationContext container=new ClassPathXmlApplicationContext("/com/rajat/resources/beanconf.xml");
		Student st=(Student)container.getBean("stdObj"); 
		System.out.println("Name:"+st.getName());
		System.out.println("Roll no:"+st.getRollno());
		*/

		//Using BeanFactory
		/*
		   Resource res=new ClassPathResource("/com/rajat/resources/beanconf.xml");
		   BeanFactory container=new XmlBeanFactory(res);
		   Student st=(Student)container.getBean("stdObj"); 
		   System.out.println("Name:"+st.getName());
		   System.out.println("Roll no:"+st.getRollno());
		   
		   st=container.getBean(Student.class); // We are now calling 2nd ver of getBean()
		   System.out.println("Name:"+st.getName());
		   System.out.println("Roll no:"+st.getRollno());
		*/
		
		}

}
