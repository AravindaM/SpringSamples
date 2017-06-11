package com.aravinda;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFactoryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		Organization organization = (Organization) context.getBean("organization");
//		String msg = organization.getMessage();
//		System.out.println(msg);

		Organization organization2 = (Organization) context.getBean("organization2");

		System.out.println(organization);
		System.out.println("-----------");
		System.out.println(organization);

		((ClassPathXmlApplicationContext)context).close();
	}

}
