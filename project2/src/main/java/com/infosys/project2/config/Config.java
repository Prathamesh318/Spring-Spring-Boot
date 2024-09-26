package com.infosys.project2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.infosys.project2.beans.Employee;
import com.infosys.project2.beans.Employee1;
import com.infosys.project2.beans.Project;
import com.infosys.project2.beans.Project1;




@Configuration
public class Config {

	@Bean
	Employee getEmployee() {
		Employee emp=new Employee();
		emp.seteId(101);
		emp.setEmpName("Prathamesh");	
		return emp;
	}
	@Bean
	Project getProject() {
		Project p=new Project();
		p.setProjectName("ReactFlix");
		p.setStartdate("10 May 2024");
		p.setEnddate("10 June 2024");
		p.setProjectstack("React,Nodejs,Mongodb");
		
		return p;
		
	}
	@Bean
	Employee1 getEmployee1(){
		Employee1 emp=new Employee1();
		emp.setEid(103);
		emp.setEmpName("Prathamesh");
		
		return emp;
	}
	
	@Bean
	Project1 getProject1() {
		Project1 p1=new Project1("FLutterApp","10 may 2024","10 jan 2024","Flutter");
		
		return p1;
	}
	
}
