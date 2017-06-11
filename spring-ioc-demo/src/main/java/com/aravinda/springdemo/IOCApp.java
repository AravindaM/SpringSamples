package com.aravinda.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		Organization organization = (Organization) context.getBean("organization");
		String msg = organization.getMessage();
		System.out.println(msg);
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
