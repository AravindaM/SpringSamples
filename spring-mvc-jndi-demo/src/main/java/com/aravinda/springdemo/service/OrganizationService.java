package com.aravinda.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aravinda.springdemo.dao.OrganizationDao;
import com.aravinda.springdemo.domain.Organization;

@Service
public class OrganizationService {

	@Autowired
	private OrganizationDao orgDao;
	
	public List<Organization> getOrgnizationList(){
		return orgDao.getAllOrganizations();
	}
}
