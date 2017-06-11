package com.aravinda.springdemo.domain;


public class Organization {
	
	private String company;
	private int year;
	public void setCompany(String company) {
		this.company = company;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	private Address address;
	
	
	public String getMessage(){
		return "Seasonal greeting from Spring team";
	}

	@Override
	public String toString() {
		return "Organization [company=" + company + ", year=" + year + ", address=" + address + "]";
	}
	
}
