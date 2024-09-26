package com.employee.beans;

public class Employee {
    private int id;
    private String designation;
    private double salary;
    private Address address; // Dependency

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    
    public void ShowEmpDetails() {
        System.out.println( "Employee{" +
                "id=" + id +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                ",\n address=" + address +
                '}');
        
    }
}

