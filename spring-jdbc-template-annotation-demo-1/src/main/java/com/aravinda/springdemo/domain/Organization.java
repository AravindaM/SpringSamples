package com.aravinda.springdemo.domain;

public class Organization {

	private int id;
	private String companyName;
	private int  yearOfIncoperation;
	private int postalCode;
	private int employeeCount;
	private String slogan;
	
	
	public Organization() {
		super();
	}

	public Organization(String companyName, int yearOfIncoperation, int postalCode, int employeeCount, String slogan) {
		super();
		this.companyName = companyName;
		this.yearOfIncoperation = yearOfIncoperation;
		this.postalCode = postalCode;
		this.employeeCount = employeeCount;
		this.slogan = slogan;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getYearOfIncoperation() {
		return yearOfIncoperation;
	}
	public void setYearOfIncoperation(int yearOfIncoperation) {
		this.yearOfIncoperation = yearOfIncoperation;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public int getEmployeeCount() {
		return employeeCount;
	}
	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}
	public String getSlogan() {
		return slogan;
	}
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}
	
	@Override
	public String toString() {
		return "Organization [id=" + id + ", companyName=" + companyName + ", yearOfIncoperation=" + yearOfIncoperation
				+ ", postalCode=" + postalCode + ", employeeCount=" + employeeCount + ", slogan=" + slogan + "]";
	}
	
}
