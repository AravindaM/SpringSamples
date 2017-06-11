package com.aravinda.springDemo.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.aravinda.springDemo.service.BusinessService;

public class Organization {
	
	private String companyName;
	private int year;
	
	@Value("${org.postalCode}")
	private String postalCode;
	
	@Value("${org.empCount}")
	private int empCount;
	
	private BusinessService businessService;
	private String slogan;
	
	public Organization() {
		System.out.println("Default Constructor called.");
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

	@Autowired
	public void setSlogan(@Value("${org.slogan}") String slogan) {
		this.slogan = slogan;
	}

	@Override
	public String toString() {
		return "Organization [companyName=" + companyName + ", year=" + year + ", postalCode=" + postalCode
				+ ", empCount=" + empCount + ", businessService=" + businessService + ", slogan=" + slogan + "]";
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
