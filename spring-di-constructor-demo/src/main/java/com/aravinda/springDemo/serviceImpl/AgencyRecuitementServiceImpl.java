package com.aravinda.springDemo.serviceImpl;

import java.util.Random;

import com.aravinda.springDemo.service.RecruitementService;

public class AgencyRecuitementServiceImpl implements RecruitementService {

	public String recuriteEmployees(String companyName, String department, int numOfRecuters) {
		Random random = new Random();
		return " \n" + companyName + "'s " +department + " hired "+ random.nextInt(numOfRecuters)
		+ " employees using various hiring agenices";
	}

}
