package com.aravinda.springDemo.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.aravinda.springDemo.service.BusinessService;

@Component("organization")
public class Organization {
	
	@Value("${nameOfCompany}")
	private String companyName;
	
	@Value("${startUpYear}")
	private int year;
	
	@Value("${postalCode}")
	private String postalCode;
	
	@Value("${empCount:22222}")
	private int empCount;
	
	@Value("${slogan:build world class software}")
	private String slogan;
	
	private String missionStatement;
	
	@Autowired
	private Environment env;
	
	private BusinessService businessService;
	
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
	
	public String getCoperateSlogan() {
		missionStatement= env.getProperty("statement");
		return missionStatement+ " and also "+ slogan;
	}

	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

	@Override
	public String toString() {
		return "Organization [companyName=" + companyName + ", year=" + year + ", postalCode=" + postalCode
				+ ", empCount=" + empCount + ", slogan=" + slogan + ", missionStatement=" + missionStatement+ "]";
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
