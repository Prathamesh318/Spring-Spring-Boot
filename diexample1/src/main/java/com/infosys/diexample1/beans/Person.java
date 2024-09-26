package com.infosys.diexample1.beans;

public class Person {
	String Name;
	Vehicle personVehicle;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Vehicle getPersonVehicle() {
		return personVehicle;
	}
	public void setPersonVehicle(Vehicle personVehicle) {
		this.personVehicle = personVehicle;
	}
	
	public void personVehicleDetails() {
		System.out.println("Name is "+this.getName());
		this.getPersonVehicle().showVehicleDetails();
	}

}
