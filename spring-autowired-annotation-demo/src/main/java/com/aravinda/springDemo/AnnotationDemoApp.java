package com.aravinda.springDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aravinda.springDemo.domain.Organization;
import com.aravinda.springDemo.domain.promotion.TradeFair;
import com.aravinda.springDemo.domain.promotion.TradeFair2;
import com.aravinda.springDemo.domain.promotion.TradeFair3;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		TradeFair tradeFair = (TradeFair) context.getBean("tradeFair");
		System.out.println("TradeFair:: "+tradeFair.specialPromotionalPricing());
		
		TradeFair2 tradeFair2 = (TradeFair2) context.getBean("tradeFair2");
		System.out.println("TradeFair2:: "+tradeFair2.specialPromotionalPricing());
		
		TradeFair3 tradeFair3 = (TradeFair3) context.getBean("tradeFair3");
		System.out.println("TradeFair3:: "+tradeFair2.specialPromotionalPricing());
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
