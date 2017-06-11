package com.aravinda.springConstructorDemo;


public class Organization {
	
	public Organization() {
		super();
	}

	private String company;
	private int year;
	private String postalCode;
	private int empCount;
	
	public String getMessage(){
		return "Seasonal greeting from Spring team";
	}

	public Organization(String company, int year) {
		super();
		this.company = company;
		this.year = year;
	}

	@Override
	public String toString() {
		return String.format("Organization [company=%s, year=%s, postalCode=%s, empCount=%s]", company, year,
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
