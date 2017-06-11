package com.aravinda.springDemo.domain;

import com.aravinda.springDemo.service.BusinessService;

public class Organization {
	
	private String companyName;
	private int year;
	private String postalCode;
	private int empCount;
	private BusinessService businessService;
	private String slogan;
	
	public Organization() {
		super();
	}
	
	public Organization(String company, int year) {
		super();
		this.companyName = company;
		this.year = year;
	}

	public String coperateService(){
		return businessService.offerService(companyName);
	}
	
	public BusinessService getBusinessService() {
		return businessService;
	}

	public void setBusinessService(BusinessService businessService) {
		this.businessService = businessService;
	}
	
	public String getSlogan() {
		return slogan;
	}

	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

	@Override
	public String toString() {
		return String.format("Organization [company=%s, year=%s, postalCode=%s, empCount=%s]", companyName, year,
				postalCode, empCount);
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public int getEmpCount() {
		return empCount;
	}

	public void setEmpCount(int empCount) {
		this.empCount = empCount;
	}
	
}
