package com.infosys.jpademo.beans;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//import lombok.EqualsAndHashCode;
//import lombok.AllArgsConstructor;
//import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//import lombok.ToString;

//@Data
@NoArgsConstructor
//@AllArgsConstructor
//@ToString
//@EqualsAndHashCode
@Entity  // Specifies that the class is an entity. This annotation is applied to theentity class
@Table(name = "jpa_employee")
public class Employee {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private @Getter @Setter int empId;
	
	@Column
	@Getter @Setter
	private String empName;
	
	@Column(name = "emp_dept")
	@Getter @Setter
	private String empDepartment;
	
	@Getter @Setter
	private int empSalary;
	
	public Employee (String empName, String empDepartment, int empSalary) {
		this.empName = empName;
		this.empDepartment = empDepartment;
		this.empSalary = empSalary;
	}
	
}