package com.spring.orm.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name="student_details")
public class Student {
	@Id
	@Column(name="student_id")
	private int studentId;
	@Column(name="student_name")
	private String studName;
	@Column(name="student_city")
	private String studCity;
	public Student(int studentId, String studName, String studCity) {
		super();
		this.studentId = studentId;
		this.studName = studName;
		this.studCity = studCity;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getStudCity() {
		return studCity;
	}
	public void setStudCity(String studCity) {
		this.studCity = studCity;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
}
