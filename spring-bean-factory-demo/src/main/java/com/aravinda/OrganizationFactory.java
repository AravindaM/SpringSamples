package com.aravinda;

public class OrganizationFactory {

	public Organization getInstance(String company,int year){
		System.out.println("Ïnvoking Instance factory method.");
		return new Organization(company,year);
	}
}
