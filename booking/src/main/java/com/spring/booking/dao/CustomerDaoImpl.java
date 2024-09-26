package com.spring.booking.dao;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.spring.booking.beans.Customers;

@Component
public class CustomerDaoImpl implements CustomerDao{

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int addFlight(Customers c) {
		// TODO Auto-generated method stub
		
		String Query="Insert into customers values(?,?,?,?,?,?,?,?)";
		
		int res=this.jdbcTemplate.update(Query,c.getCustId(),c.getFname(),c.getLname(),c.getEmail(),c.getPhone(),c.getPnr(),c.getSeatNo(),c.getFlightId());
		return res;
	}

	@Override
	public int updateCust() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id of customers who details needs to be updates:");
		String pnr=sc.next();
		System.out.println("Enter the new email to be updated:");
		String email=sc.next();
		System.out.println("Enter the mobile number to be update:");
		String phone=sc.next();
		
		String query="Update customers set cust_email=?,cust_phone=? where pnr=?";
		
		return this.jdbcTemplate.update(query,email,phone,pnr);
	}

	@Override
	public int cancelBooking() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the PNR of customer whose flight need to be canceled :");
		String pnr=sc.next();
		String query="Delete from customers where pnr=?";
		return this.jdbcTemplate.update(query,pnr);
	}

}
