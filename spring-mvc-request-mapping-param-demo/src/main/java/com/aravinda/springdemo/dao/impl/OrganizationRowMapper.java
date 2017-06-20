package com.aravinda.springdemo.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.aravinda.springdemo.domain.Organization;

public class OrganizationRowMapper implements RowMapper<Organization> {

	public Organization mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		Organization organization = new Organization();
		organization.setId(resultSet.getInt("id"));
		organization.setCompanyName(resultSet.getString("company_name"));
		organization.setYearOfIncoperation(resultSet.getInt("year_of_incoperation"));
		organization.setPostalCode(resultSet.getInt("postal_code"));
		organization.setEmployeeCount(resultSet.getInt("employee_count"));
		organization.setSlogan(resultSet.getString("slogan"));
		return organization;
	}

}