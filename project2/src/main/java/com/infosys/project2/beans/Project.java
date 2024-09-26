package com.infosys.project2.beans;
public class Project {
	String ProjectName;
	String startdate;
	String enddate;
	String projectstack;
	public String getProjectName() {
		return ProjectName;
	}
	public void setProjectName(String projectName) {
		this.ProjectName = projectName;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public String getProjectstack() {
		return projectstack;
	}
	public void setProjectstack(String projectstack) {
		this.projectstack = projectstack;
	}
	
	public void showProjectDetails() {
		System.out.println("Project Name :"+this.getProjectName());
		System.out.println("Project Start Date:"+this.getStartdate());
		System.out.println("Project End Date :"+this.getEnddate());
		System.out.println("Project stack :"+this.getProjectstack());		
	}
	
}

