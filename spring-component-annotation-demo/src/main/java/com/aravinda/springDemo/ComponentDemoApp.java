package com.aravinda.springDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aravinda.springDemo.domain.promotion.TradeFair;

public class ComponentDemoApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		TradeFair tradeFair = (TradeFair) context.getBean("tradeFair");
		System.out.println("TradeFair:: "+tradeFair.specialPromotionalPricing());
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
