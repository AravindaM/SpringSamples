package com.aravinda.springDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aravinda.springDemo.domain.Organization;

public class PropertiesAnnotateDemoApp {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(PropertyConfig.class);

		Organization org = (Organization) context.getBean("organization");

		System.out.println(org);
		System.out.println("Slogan :: " + org.getCoperateSlogan());

		((AnnotationConfigApplicationContext) context).close();
	}

}
