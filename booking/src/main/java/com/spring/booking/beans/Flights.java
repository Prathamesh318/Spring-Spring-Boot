package com.spring.booking.beans;

import org.springframework.stereotype.Component;

@Component
public class Flights {
	String pnr;
	String name;
	String depart;
	String arrive;
	String date;
	public String getPnr() {
		return pnr;
	}
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	public String getArrive() {
		return arrive;
	}
	public void setArrive(String arrive) {
		this.arrive = arrive;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Flights(String pnr, String name, String depart, String arrive, String date) {
		super();
		this.pnr = pnr;
		this.name = name;
		this.depart = depart;
		this.arrive = arrive;
		this.date = date;
	}
	public Flights() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
