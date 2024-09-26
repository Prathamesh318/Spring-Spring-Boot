package com.spring.jdbcprac.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.spring.jdbcprac.*")
public class Config {
	
	private String dbuser="postgres";
	private String dbpassword="3108";
	//api:database://hostname:portno/databasename
	private String dburl="jdbc:postgresql://localhost:5432/spring";
	
	@Bean("ds")
	public DataSource getDataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("org.postgresql.Driver");
		ds.setUsername(dbuser);
		ds.setPassword(dbpassword);
		ds.setUrl(dburl);		
		return ds;
	}
	

	
	@Bean("JdbcTemplate")
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jd=new JdbcTemplate();
		jd.setDataSource(getDataSource());
		return jd;
	}
	
	
	

}
