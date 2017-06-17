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

	@RequestMapping("/jstlsql")
	public String listOrganizationUsingSqlTag(){
		return "listOrganizationJndi";
	}
	
	@RequestMapping("/service")
	public String listOrganizationUsingService(Model model){
		List<Organization> organizations = organizationService.getOrgnizationList();
		model.addAttribute("orgList",organizations);
		return "listOrganizationService"; 
	}
}
