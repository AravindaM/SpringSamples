package com.aravinda.springdemo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.BadSqlGrammarException;

import com.aravinda.springdemo.dao.OrganizationDao;
import com.aravinda.springdemo.dao.impl.OrganizationDaoImpl;
import com.aravinda.springdemo.domain.Organization;

public class JdbcTemplateAnnotationApp {

	public static void main(String[] args) {
		
		//create application context
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		//Create beans
		OrganizationDao orgDao = (OrganizationDaoImpl) context.getBean("orgDAO");
		List<Organization> orgs = null;
		
		try{
			orgs = orgDao.getAllOrganizations();
		}catch(BadSqlGrammarException bsg){
			System.out.println("\nSUB Exception msg :: "+bsg.getMessage());
			System.out.println("\nSUB Exception Class:: "+bsg.getClass());
			
		}catch(DataAccessException dae){
			System.out.println("\nException msg :: "+dae.getMessage());
			System.out.println("\nException Class:: "+dae.getClass());
			
		}
		
		for(Organization org:orgs){
			System.out.println(org);
		}
		
		//close the application context
		((ClassPathXmlApplicationContext)context).close();
	}
}
