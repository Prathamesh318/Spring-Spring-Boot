package com.infosys.project2.beans;

import org.springframework.beans.factory.annotation.Autowired;


public class Employee {
		int eId;
		String empName;
		Project p1;
		public int geteId() {
			return eId;
		}
		public void seteId(int i) {
			this.eId = i;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		
		public Project getEmpProject() {
			return p1;
		}
		@Autowired
		public void setEmpProject(Project p) {
			this.p1=p;
		}
		public void showEmpDetails() {
			System.out.println("Employee Id :"+this.geteId());
			System.out.println("Employee Name :"+this.getEmpName());
			this.getEmpProject().showProjectDetails();
		}
}
