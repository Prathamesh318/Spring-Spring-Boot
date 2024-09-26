package com.infosys.diexample1.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
		int empId;
		String empName;
		@Autowired
		Address empAddress;
		public int getEmpId() {
			return empId;
		}
		
		public void setEmpId(int empId) {
			this.empId=empId;
		}
		
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName=empName;
		}
		
		public void getEmpDetail() {
			System.out.println("Employee Name :"+this.getEmpName()+" Employee Id:"+this.getEmpId());
			empAddress.getAddress();
		}
}
