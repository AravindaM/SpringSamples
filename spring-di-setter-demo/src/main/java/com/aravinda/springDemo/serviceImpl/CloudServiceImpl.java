package com.aravinda.springDemo.serviceImpl;

import java.util.Random;

import com.aravinda.springDemo.service.BusinessService;

public class CloudServiceImpl implements BusinessService{

	public String offerService(String companyName) {
		Random random = new Random();
		String service = "\n As an Organization, " + companyName +
				" offers world class Cloud Computing infrastructure."+
				"\n The income exceeds "+ random.nextInt(revenue) + "dollars.";
		return service;
	}

}
