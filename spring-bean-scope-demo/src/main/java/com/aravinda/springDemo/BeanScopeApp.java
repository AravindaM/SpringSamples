package com.aravinda.springDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aravinda.springDemo.domain.Organization;

public class BeanScopeApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		Organization organization = (Organization) context.getBean("organization");
		Organization organization2 = (Organization) context.getBean("organization");
		organization2.setPostalCode("989898");
		System.out.println(organization.coperateService());
		System.out.println(organization.getSlogan());
		
		System.out.println("organization ::"+organization);
		System.out.println("organization2 ::"+organization2);
		
		
		if(organization ==organization2){
			System.out.println("Using singelton scope for organization");
		}else{
			System.out.println("Different objects for organization");
		}
		
		System.out.println(organization);
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
