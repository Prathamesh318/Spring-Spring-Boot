package com.infosys.firstproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.infosys.firstproject.beans.Employee;

@Configuration
class Config {
	@Bean
	Employee getEmployeeDetail() {
		Employee emp=new Employee();
		emp.setEmpId(0);
		emp.setEmployeeName("Damon");
		return emp;
	}
	String name() {
		return "Hello class";
	}
	
}
