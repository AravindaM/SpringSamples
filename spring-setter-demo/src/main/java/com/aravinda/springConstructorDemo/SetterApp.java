package com.aravinda.springConstructorDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		Organization organization = (Organization) context.getBean("organization");
		String msg = organization.getMessage();
		System.out.println(msg);
		
		System.out.println(organization);
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
