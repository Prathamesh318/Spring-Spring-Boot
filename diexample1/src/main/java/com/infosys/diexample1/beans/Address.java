package com.infosys.diexample1.beans;

public class Address {
	String city;
	int pincode;
	public Address() {
		
	}
	public Address(String city,int pincode) {
		this.city=city;;
		this.pincode=pincode;
	}
	public void  getAddress() {
		System.out.println("City :"+city+"Pincode"+pincode);	
	}
	
}
