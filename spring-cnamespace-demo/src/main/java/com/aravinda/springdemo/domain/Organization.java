package com.aravinda.springdemo.domain;


public class Organization {
	
	private String company;
	private int year;
	private Address address;
	
	public Organization(String company, int year, Address address) {
		super();
		this.company = company;
		this.year = year;
		this.address = address;
	}
	
	public Organization() {
		super();
	}
	
	public String getMessage(){
		return "Seasonal greeting from Spring team";
	}

	@Override
	public String toString() {
		return "Organization [company=" + company + ", year=" + year + ", address=" + address + "]";
	}
	
}
