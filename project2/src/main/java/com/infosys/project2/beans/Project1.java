package com.infosys.project2.beans;

public class Project1 {
	String projectName;
	String StartDate;
	String EndDate;
	String projStack;
	
	
	public Project1(String projectName,String s,String e,String S) {
		super();
		this.projectName=projectName;
		this.StartDate=s;
		this.EndDate=e;
		this.projStack=S;
	}
	
	public void getProjectDetails() {
		System.out.println("Project Name :"+projectName);
		System.out.println("Start Date :"+StartDate);
		System.out.println("End Date :"+EndDate);
		System.out.println("Project Stack :"+projStack);
	}
}
