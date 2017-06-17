package com.aravinda.springdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.impl.StaticLoggerBinder;
import org.springframework.stereotype.Service;

import com.aravinda.springdemo.domain.Organization;

@Service
public class DaoUtils {

	private static Logger LOGGER = LoggerFactory.getLogger(DaoUtils.class);

	public final String createOp = "CREATE";
	public final String readOp = "READ";
	public final String updateeOp = "UPDATE";
	public final String deleteOp = "DELETE";
	public final String truncateOp = "TRUNCATE";

	public void printOrganizations(List<Organization> orgs, String op) {
		LOGGER.info("\n************* Printing organizations after " + op + " operation*************");
		for (Organization org : orgs) {
			LOGGER.info(org.toString());
		}
	}

	public void printOrganization(Organization org, String op) {
		LOGGER.info("\n************* Printing organization after " + op + " operation*************");
		LOGGER.info(org.toString());
	}

	public void printSuccessFailure(String op, boolean param) {
		LOGGER.info("\nOperation " + op + (param ? " SUCCESS" : " FAILED"));
	}

	public void createSedData(OrganizationDao dao) {
		Organization org1 = new Organization("Amazon", 1994, 656565, 8765, "Work Hard, Have fun, Make History");
		Organization org2 = new Organization("Google", 2004, 757878, 10000, "Don't be evil");
		Organization org3 = new Organization("Alibaba", 2006, 898989, 15000, "To make it easy to do business anywhere");

		List<Organization> orgs = new ArrayList<Organization>();
		orgs.add(0, org1);
		orgs.add(0, org2);
		orgs.add(0, org3);

		int createCount = 0;
		for (Organization org : orgs) {
			boolean created = dao.create(org);
			if (created)
				createCount++;
		}
		LOGGER.info("Created " + createCount + " Organizations.");

	}

	public void printOrgCount(List<Organization> orgs, String op) {
		LOGGER.info("\nCurrently we have " + orgs.size() + " orgnizations after " + op + " operation");
	}
}
