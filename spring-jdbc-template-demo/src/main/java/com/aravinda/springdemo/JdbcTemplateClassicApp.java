package com.aravinda.springdemo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aravinda.springdemo.dao.OrganizationDao;
import com.aravinda.springdemo.dao.impl.OrganizationDaoImpl;
import com.aravinda.springdemo.domain.Organization;

public class JdbcTemplateClassicApp {

	public static void main(String[] args) {
		
		//create application context
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		//Create beans
		OrganizationDao orgDao = (OrganizationDaoImpl) context.getBean("orgDAO");
		List<Organization> orgs = orgDao.getAllOrganizations();
		
		for(Organization org:orgs){
			System.out.println(org);
		}
		
		//close the application context
		((ClassPathXmlApplicationContext)context).close();
	}
}
