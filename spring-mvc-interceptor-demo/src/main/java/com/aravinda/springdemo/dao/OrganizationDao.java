package com.aravinda.springdemo.dao;

import java.util.List;

import javax.sql.DataSource;

import com.aravinda.springdemo.domain.Organization;

public interface OrganizationDao {

	void setDataSource(DataSource dataSource);
	
	boolean create(Organization org);
	
	Organization getOrganization();
	
	List<Organization> getAllOrganizations();
	
	boolean update(Organization org);
	
	void cleanup();
}
