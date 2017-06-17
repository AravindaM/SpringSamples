package com.aravinda.springdemo.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.aravinda.springdemo.dao.OrganizationDao;
import com.aravinda.springdemo.domain.Organization;

@Repository
public class OrganizationDaoImpl implements OrganizationDao {

	private NamedParameterJdbcTemplate namedParamJdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		namedParamJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	public boolean create(Organization org) {
		// BeanPropertySqlParameterSource - Use when need to pass a bean.
		SqlParameterSource paramSource = new BeanPropertySqlParameterSource(org);
		String sqlQuery = "INSERT INTO organization (company_name,year_of_incoperation,postal_code,employee_count,slogan) "
				+ "VALUES(:companyName,:yearOfIncoperation,:postalCode,:employeeCount,:slogan)";

		return namedParamJdbcTemplate.update(sqlQuery, paramSource) == 1;
	}

	public Organization getOrganization(int id) {
		// MapSqlParameterSource - Use when need to pass a single parameter.
		SqlParameterSource params = new MapSqlParameterSource("ID", id);
		String query = "SELECT * FROM organization WHERE id=:ID";
		return namedParamJdbcTemplate.queryForObject(query, params, new OrganizationRowMapper());
	}

	public List<Organization> getAllOrganizations() {
		String sqlQuery = "SELECT * FROM organization";
		List<Organization> orgList = namedParamJdbcTemplate.query(sqlQuery, new OrganizationRowMapper());
		return orgList;
	}

	public boolean update(Organization org) {
		SqlParameterSource paramSource = new BeanPropertySqlParameterSource(org);
		String sqlQuery = "UPDATE organization SET slogan=:slogan where id=:id";
		return namedParamJdbcTemplate.update(sqlQuery, paramSource) == 1;
	}

	public void cleanup() {
		String sqlQuery = "TRUNCATE TABLE organization";
		// This uses default jdbc operation.
		namedParamJdbcTemplate.getJdbcOperations().execute(sqlQuery);
	}

	public boolean delete(Organization org) {
		SqlParameterSource paramSource = new BeanPropertySqlParameterSource(org);
		String sqlQuery = "DELETE FROM organization WHERE id=:id";
		return namedParamJdbcTemplate.update(sqlQuery,paramSource) == 1;
	}

}
