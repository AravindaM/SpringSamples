package com.aravinda.springDemo.service;

import com.aravinda.springDemo.domain.Organization;

public class HumanResourceDepartment implements Department {

	private String depatmentName;
	private RecruitementService recruitementService;
	private Organization organization;
	
	
	public String getDepatmentName() {
		return depatmentName;
	}


	public void setDepatmentName(String depatmentName) {
		this.depatmentName = depatmentName;
	}


	public HumanResourceDepartment(RecruitementService recruitementService, Organization organization) {
		super();
		this.recruitementService = recruitementService;
		this.organization = organization;
	}


	public String hiringStatus(int numOfrecruiters) {
		return recruitementService.recuriteEmployees(organization.getCompanyName(), depatmentName, numOfrecruiters);
	}

}
