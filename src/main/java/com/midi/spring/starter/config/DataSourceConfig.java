package com.midi.spring.starter.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:spring/data-access.properties")
public class DataSourceConfig {

	@Autowired
	private Environment env;
	
	public DataSource dataSource() {
		org.apache.tomcat.jdbc.pool.DataSource dataSource =
				new org.apache.tomcat.jdbc.pool.DataSource();
		
		return null;
	}
}
