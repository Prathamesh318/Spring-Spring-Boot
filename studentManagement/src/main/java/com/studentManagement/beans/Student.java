package com.studentManagement.beans;

import java.util.ArrayList;
import java.util.List;

public class Student {
	String studId;
	String studName;
	List<Courses> courses;
	
	public Student() {
        this.courses = new ArrayList<>();

	}

	public String getStudId() {
		return studId;
	}

	public void setStudId(String studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public List<Courses> getCourses() {
		return courses;
	}

	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}

//	public void showStudDetails() {
//		System.out.println("Student ID:"+this.studId);
//		System.out.println("Student Name:"+this.studName);
//		System.out.println("Student Coures:");
//		
//		for(Courses course:courses) {
//			System.out.println("Course ID:"+course.getCourseId()+"/t"+"Course Name:"+course.getCourseName());
//		}
//		
//	}
}
