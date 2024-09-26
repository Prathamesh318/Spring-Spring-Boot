package com.infosys.diexample1.config;

import org.springframework.context.annotation.Configuration;

import com.infosys.diexample1.beans.Address;
import com.infosys.diexample1.beans.Book;
import com.infosys.diexample1.beans.Employee;
import com.infosys.diexample1.beans.Library;
import com.infosys.diexample1.beans.Person;
import com.infosys.diexample1.beans.Vehicle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


@Configuration
@ComponentScan("com.infosys.diexample1.beans")
public class Config {
	
		@Bean
		Address getAddress() {
			Address add=new Address("New Delhi",2344);
			return add;
		}
		
		@Bean
		Employee getEmployee() {
			Employee emp=new Employee();
			emp.setEmpName("Rohan");
			emp.setEmpId(101);
			return emp;
		}
	
		@Bean(name="audi")
		Vehicle getVehicleData() {
			Vehicle v= new Vehicle();
			v.setModelName("Audi");
			v.setMileage(7.45);
			
			return v;
		}
		
		
		@Bean 
		Person getPerson() {
			Person rohan =new Person();
			rohan.setName("Rohan");
			return rohan;
		}
		@Bean(name="book")
		Book getBook() {
			Book book=new Book("Twisted Love",1,"Ana Haung");
			
			
			return book;
			
		}
		
//		@Bean 
//		Library getLibrary() {
//			Library library=new Library(1,"Library Name");
//			
//			return library;
//		}
//		
}
