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
		System.out.println("Default Constructor called.");
	}
	
	public Organization(String company, int year) {
		super();
		this.companyName = company;
		this.year = year;
		System.out.println("Constructor called.");
	}
	
//	public void initialize(){
//		System.out.println("Organization :: Init method called.");
//	}
//	
//	public void destroy(){
//		System.out.println("Organization :: Destroy method called.");
//	}
	
	public void postConstruct(){
		System.out.println("Organization :: postConstruct method called.");
	}
	
	public void preDestroy(){
		System.out.println("Organization :: preDestroy method called.");
	}
		

	public String coperateService(){
		System.out.println("Set coperate service called.");
		return businessService.offerService(companyName);
	}
	
	public BusinessService getBusinessService() {
		return businessService;
	}

	public void setBusinessService(BusinessService businessService) {
		System.out.println("SetBusinessService called.");
		this.businessService = businessService;
	}
	
	public String getSlogan() {
		return slogan;
	}

	public void setSlogan(String slogan) {
		this.slogan = slogan;
		System.out.println("Set slogan called.");
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
