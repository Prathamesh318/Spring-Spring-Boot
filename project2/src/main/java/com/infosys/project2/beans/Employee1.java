package com.infosys.project2.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee1 {
	int eid;
	String empName;
	@Autowired
	Project empProject;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void showEmployeeDetails() {
		System.out.println("Employee id:"+this.getEid());
		System.out.println("Employee name :"+this.getEmpName());
		
		empProject.showProjectDetails();
	}
	
}
