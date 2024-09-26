package com.spring.expressdepartment.beans;

import org.springframework.stereotype.Component;

@Component
public class HOD {
	private int hodId;
	private String hodName;
	private int hodExp;
	private String hodInDate;
	public HOD() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HOD(int hodId, String hodName, int hodExp, String hodInDate) {
		super();
		this.hodId = hodId;
		this.hodName = hodName;
		this.hodExp = hodExp;
		this.hodInDate = hodInDate;
	}
	public int getHodId() {
		return hodId;
	}
	public void setHodId(int hodId) {
		this.hodId = hodId;
	}
	public String getHodName() {
		return hodName;
	}
	public void setHodName(String hodName) {
		this.hodName = hodName;
	}
	public int getHodExp() {
		return hodExp;
	}
	public void setHodExp(int hodExp) {
		this.hodExp = hodExp;
	}
	public String getHodInDate() {
		return hodInDate;
	}
	public void setHodInDate(String hodInDate) {
		this.hodInDate = hodInDate;
	}
	
	
	
}
