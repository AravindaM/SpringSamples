package com.aravinda.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aravinda.springdemo.domain.Organization;
import com.aravinda.springdemo.service.OrganizationService;

@Controller
public class OrganizationController {

	@Autowired
	private OrganizationService organizationService;

	@RequestMapping("/listOrgs")
	public String listOrganizations(Model model){
		List<Organization> organizations = organizationService.getOrgnizationList();
		model.addAttribute("orgList",organizations);
		return "listOrganizations"; 
	}
	
	@RequestMapping("/location")
	public String addLocation(Model model){
		return "location";
	}
}
