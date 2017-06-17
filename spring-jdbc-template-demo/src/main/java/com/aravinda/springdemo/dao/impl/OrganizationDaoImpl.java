package com.aravinda.springdemo.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.aravinda.springdemo.dao.OrganizationDao;
import com.aravinda.springdemo.domain.Organization;

public class OrganizationDaoImpl implements OrganizationDao {

	private JdbcTemplate jdbcTemplate;
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public boolean create(Organization org) {
		// TODO Auto-generated method stub
		return false;
	}

	public Organization getOrganization() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Organization> getAllOrganizations() {
		String sqlQuery = "SELECT * FROM organization";
		List<Organization> orgList = jdbcTemplate.query(sqlQuery,new OrganizationRowMapper());
		return orgList;
	}

	public boolean update(Organization org) {
		// TODO Auto-generated method stub
		return false;
	}

	public void cleanup() {
		// TODO Auto-generated method stub

	}

}
