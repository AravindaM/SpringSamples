package com.aravinda.springDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aravinda.springDemo.domain.Organization;

public class InitDestroyDemoApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		/*Organization organization = (Organization) context.getBean("organization");
		System.out.println(organization.coperateService());
		System.out.println(organization.getSlogan());
		
		System.out.println(organization);*/
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
