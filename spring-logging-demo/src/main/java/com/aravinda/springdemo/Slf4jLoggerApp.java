package com.aravinda.springdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.aravinda.springdemo.dao.DaoUtils;
import com.aravinda.springdemo.dao.OrganizationDao;
import com.aravinda.springdemo.domain.Organization;

@Component
public class Slf4jLoggerApp {

	@Autowired
	private DaoUtils daoUtils;

	@Autowired
	private OrganizationDao orgDao;

	public static void main(String[] args) {

		// create application context
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-cp.xml");

		Slf4jLoggerApp app = context.getBean(Slf4jLoggerApp.class);
		app.actionMethod();
		
		// close the application context
		((ClassPathXmlApplicationContext) context).close();
	}

	public void actionMethod() {
		// Create beans
//		orgDao.cleanup();
		daoUtils.createSedData(orgDao);
		

		List<Organization> orgs = orgDao.getAllOrganizations();
		daoUtils.printOrganizations(orgs, daoUtils.readOp);

		// create a new organization
		Organization organization = new Organization("General Electric", 1978, 89898, 6500, "Imagination at work");
		boolean created = orgDao.create(organization);
		daoUtils.printSuccessFailure(daoUtils.createOp, created);

		// Get all organizations
		orgs = orgDao.getAllOrganizations();
		daoUtils.printOrgCount(orgs, daoUtils.createOp);
		daoUtils.printOrganizations(orgs, daoUtils.createOp);

		// Get a single organization
		Organization org = orgDao.getOrganization(1);
		daoUtils.printOrganization(org, daoUtils.readOp);

		// update slogan
		Organization org2 = orgDao.getOrganization(2);
		org2.setSlogan("We Build **awesome** driving machines");
		boolean isUpdated = orgDao.update(org2);
		daoUtils.printSuccessFailure(daoUtils.updateeOp, isUpdated);
		daoUtils.printOrganization(orgDao.getOrganization(2), daoUtils.updateeOp);

		// Delete organization
		Organization org3 = orgDao.getOrganization(3);
		boolean isDeleted = orgDao.delete(org3);
		daoUtils.printSuccessFailure(daoUtils.deleteOp, isDeleted);
		daoUtils.printOrganizations(orgDao.getAllOrganizations(), daoUtils.deleteOp);

		// Cleanup data
		orgDao.cleanup();
		daoUtils.printOrgCount(orgDao.getAllOrganizations(), daoUtils.truncateOp);

	}
}
