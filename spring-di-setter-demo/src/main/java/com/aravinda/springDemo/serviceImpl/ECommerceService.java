package com.aravinda.springDemo.serviceImpl;

import java.util.Random;

import com.aravinda.springDemo.service.BusinessService;

public class ECommerceService implements BusinessService {

	public String offerService(String companyName) {
		Random random = new Random();
		String service = "\n As an Organization, " + companyName +
				" provides outstanding e-commerce platform."+
				"\n The income exceeds "+ random.nextInt(revenue) + "dollars.";
		return service;
	}

}
