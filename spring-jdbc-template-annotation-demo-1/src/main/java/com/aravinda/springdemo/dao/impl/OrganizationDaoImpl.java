package com.aravinda.springdemo.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.aravinda.springdemo.dao.OrganizationDao;
import com.aravinda.springdemo.domain.Organization;

@Repository("orgDAO")
public class OrganizationDaoImpl implements OrganizationDao {

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public boolean create(Organization org) {
		String sqlQuery = "INSERT INTO organization (company_name,year_of_incoperation,postal_code,employee_count,slogan) VALUES(?,?,?,?,?)";
		//Order is important here.
		Object[] args = new Object[] {org.getCompanyName(),org.getYearOfIncoperation(),org.getPostalCode(),org.getEmployeeCount(),org.getSlogan()};
		return jdbcTemplate.update(sqlQuery,args)==1;
	}

	public Organization getOrganization(int id) {
		String query = "SELECT * FROM organization WHERE id=?"; 
		Object[] args = new Object[]{id};
		return jdbcTemplate.queryForObject(query, args, new OrganizationRowMapper());
	}

	public List<Organization> getAllOrganizations() {
		String sqlQuery = "SELECT * FROM organization";
		List<Organization> orgList = jdbcTemplate.query(sqlQuery,new OrganizationRowMapper());
		return orgList;
	}

	public boolean update(Organization org) {
		String sqlQuery = "UPDATE organization SET slogan=? where id=?";
		Object[] args = new Object[]{org.getSlogan(),org.getId()};
		return jdbcTemplate.update(sqlQuery,args) == 1;
	}

	public void cleanup() {
		//Remove all data and reset auto increment id as well.
		String sqlQuery ="TRUNCATE TABLE organization";
		jdbcTemplate.execute(sqlQuery);
	}

	public boolean delete(Organization org) {
		String sqlQuery ="DELETE FROM organization WHERE id=?";
		Object[] args = new Object[] {org.getId()};
		return jdbcTemplate.update(sqlQuery,args)==1;
	}


}
