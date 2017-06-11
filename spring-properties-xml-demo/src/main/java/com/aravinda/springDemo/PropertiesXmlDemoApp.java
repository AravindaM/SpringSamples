package com.aravinda.springDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aravinda.springDemo.domain.Organization;
import com.aravinda.springDemo.domain.promotion.TradeFair;

public class PropertiesXmlDemoApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		Organization org= (Organization) context.getBean("organization");
		
		System.out.println(org);
		((ClassPathXmlApplicationContext)context).close();
	}

}
