package com.aravinda;


public class Organization {
	
	public Organization() {
		super();
	}

	private String company;
	private int year;
	
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
		return "Organization [company=" + company + ", year=" + year + "]";
	}
	
	public static Organization createInstance(String company,int year){
		System.out.println("Invoking static factory method");
		return new Organization(company,year);
	}
	
}
