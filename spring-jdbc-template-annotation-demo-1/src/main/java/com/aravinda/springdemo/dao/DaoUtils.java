package com.aravinda.springdemo.dao;

import java.util.ArrayList;
import java.util.List;

import com.aravinda.springdemo.domain.Organization;

public class DaoUtils {

	public static final String createOp = "CREATE";
	public static final String readOp = "READ";
	public static final String updateeOp = "UPDATE";
	public static final String deleteOp = "DELETE";
	public static final String truncateOp = "TRUNCATE";

	public static void printOrganizations(List<Organization> orgs, String op) {
		System.out.println("\n************* Printing organizations after " + op + " operation*************");
		for (Organization org : orgs) {
			System.out.println(org);
		}
	}
	public static void printOrganization(Organization org,String op){
		System.out.println("\n************* Printing organization after " + op + " operation*************");
		System.out.println(org);
	}

	public static void printSuccessFailure(String op, boolean param) {
		System.out.println("\nOperation "+op + (param ? " SUCCESS" : " FAILED"));
	}

	public static void createSedData(OrganizationDao dao) {
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
		System.out.println("Created " + createCount + " Organizations.");

	}

	public static void printOrgCount(List<Organization> orgs, String op) {
		System.out.println("\nCurrently we have " + orgs.size() + " orgnizations after " + op + " operation");
	}
}
