package com.aravinda.springdemo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aravinda.springdemo.dao.DaoUtils;
import com.aravinda.springdemo.dao.OrganizationDao;
import com.aravinda.springdemo.dao.impl.OrganizationDaoImpl;
import com.aravinda.springdemo.domain.Organization;

public class JdbcTemplateAnnotationApp {

	public static void main(String[] args) {
		
		//create application context
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		//Create beans
		OrganizationDao orgDao = (OrganizationDaoImpl) context.getBean("orgDAO");
		DaoUtils.createSedData(orgDao);
		
		List<Organization> orgs = orgDao.getAllOrganizations();
		DaoUtils.printOrganizations(orgs, DaoUtils.readOp);
		
		//create a new organization
		Organization organization = new Organization("General Electric",1978,89898,6500,"Imagination at work");
		boolean created = orgDao.create(organization);
		DaoUtils.printSuccessFailure(DaoUtils.createOp, created);
		
		//Get all organizations
		orgs = orgDao.getAllOrganizations();
		DaoUtils.printOrgCount(orgs, DaoUtils.createOp);
		DaoUtils.printOrganizations(orgs, DaoUtils.createOp);
		
		//Get a single organization
		Organization org = orgDao.getOrganization(1);
		DaoUtils.printOrganization(org, DaoUtils.readOp);
		
		//update slogan
		Organization org2 = orgDao.getOrganization(2);
		org2.setSlogan("We Build **awesome** driving machines");
		boolean isUpdated = orgDao.update(org2);
		DaoUtils.printSuccessFailure(DaoUtils.updateeOp, isUpdated);
		DaoUtils.printOrganization(orgDao.getOrganization(2), DaoUtils.updateeOp);

		//Delete organization
		Organization org3 = orgDao.getOrganization(3);
		boolean isDeleted = orgDao.delete(org3);
		DaoUtils.printSuccessFailure(DaoUtils.deleteOp, isDeleted);
		DaoUtils.printOrganizations(orgDao.getAllOrganizations(), DaoUtils.deleteOp);

		
		//Cleanup data
		orgDao.cleanup();
		DaoUtils.printOrgCount(orgDao.getAllOrganizations(), DaoUtils.truncateOp);
		
		//close the application context
		((ClassPathXmlApplicationContext)context).close();
	}
}
