package com.aspectop.beans;

//import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
//	@Value("1")
	private int empId;
//	@Value("Prathamesh")
	private String empName;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	
	public void showDetails() {
		System.out.println("{Emp ID"+this.empId+"Emp Name:"+this.empName+"}");
	}
	public void showERR() {
		System.out.println("Error occurred");
		throw new NullPointerException("Exception occured");
	}
}
