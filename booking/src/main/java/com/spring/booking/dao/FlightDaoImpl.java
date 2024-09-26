package com.spring.booking.dao;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.booking.beans.Customers;
import com.spring.booking.beans.Flights;




@Component
public class FlightDaoImpl implements FlightDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public void displayFlightByDest(String s) {
		String query="Select * from flights where arrive=?";
		List<Flights> list=this.jdbcTemplate.query(query,new FlightRowMapper(),s);
		
		for(Flights flight:list) {
			System.out.println("Flight PNR :"+flight.getPnr());
			System.out.println("Flight Name :"+flight.getName());
			System.out.println("Flight From :"+flight.getDepart());
			System.out.println("Departure Date :"+flight.getDate());
			System.out.println();
		}
	}
	@Override
	public void displayFlightByCustomer() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the customer id");
		int id=sc.nextInt();
		String Query="Select f.* from flights f join customers c on f.flight_id=c.flight_id where cust_id=?";
		System.out.println("Flights booked by customer with Customer Id :"+id+" :");
		List<Flights>list=this.jdbcTemplate.query(Query, new FlightRowMapper(), id);
		for(Flights flight:list) {
		System.out.println("Flight PNR :"+flight.getPnr());
		System.out.println("Flight Name :"+flight.getName());
		System.out.println("Flight From :"+flight.getDepart());
		System.out.println("Departure Date :"+flight.getDate());
		System.out.println();
		}
	}


}
