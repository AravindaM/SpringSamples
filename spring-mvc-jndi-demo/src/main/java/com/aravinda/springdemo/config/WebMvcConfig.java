package com.aravinda.springdemo.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@Configuration
@ComponentScan("com.aravinda.springdemo")
@EnableWebMvc
public class WebMvcConfig extends WebMvcConfigurerAdapter {

	@Bean
	public DataSource DataSource() {
		final JndiDataSourceLookup dataSourceLookup = new JndiDataSourceLookup();
		dataSourceLookup.setResourceRef(true);
		DataSource dataSource = dataSourceLookup.getDataSource("jdbc/springdb");
		return dataSource;
	}

	@Bean
	public UrlBasedViewResolver urlBasedViewResolver() {
		UrlBasedViewResolver viewResolver = new UrlBasedViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		viewResolver.setViewClass(JstlView.class);
		return viewResolver;
	}

}
