package com.spring.booking;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.booking.beans.Customers;
import com.spring.booking.config.Config;
import com.spring.booking.dao.CustomerDaoImpl;
import com.spring.booking.dao.FlightDaoImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
    	
    	
    	CustomerDaoImpl Cust=context.getBean(CustomerDaoImpl.class);
    	FlightDaoImpl flight=context.getBean(FlightDaoImpl.class);
    	flight.displayFlightByDest("Mumbai");
    	
    	
    	Scanner sc=new Scanner(System.in);
    	
    	System.out.println("Enter 1 to Book a flight ");
    	System.out.println("Enter 2 to update customer details ");
    	System.out.println("Enter 3 to get all flights for a particular destination");
    	System.out.println("Enter 4 to cancel a booking ");
    	System.out.println("Enter 5 the flights booked by a particular customer");
    	System.out.println();
    	int ch=sc.nextInt();
 	
    	switch (ch) {
		case 1: {
			System.out.println("Enter id:");
			int id=sc.nextInt();
			System.out.println("Enter the first Name:");
			String fname=sc.next();
			System.out.println("Enter the last Name:");
			String lname=sc.next();
			System.out.println("Enter the email");
			String email=sc.next();
			System.out.println("Enter the phone number:");
			String phone=sc.next();
			System.out.println("Enter Unique PNR :");
			String PNR=sc.next();
			
			System.out.println("Enter the seat number");
			int seatNo=sc.nextInt();
			System.out.println("Enter the flight Number :");
			String flightNumber=sc.next();
			Customers C=new Customers(id,fname,lname,email,phone,PNR,seatNo,flightNumber);
			int res=Cust.addFlight(C);
			if(res==1) {
				System.out.println("Customer successfully added");
			}
			else {
				System.out.println("Operation failed");
			}
			break;
		}
		case 2:{
	    	int res=Cust.updateCust();
	    	if(res==1) {
				System.out.println("Customer details successfully updated");
			}
			else {
				System.out.println("Operation failed");
			}
			break;
		}
		case 3:{
			System.out.println("Enter the destination:");
			String dest=sc.next();
			flight.displayFlightByDest(dest);
			break;
		}
		case 4:{
			Cust.cancelBooking();
			System.out.println("Booking Cancelled");
			break;
		}
		case 5:{
			flight.displayFlightByCustomer();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + ch);
		}
    	
    	

  	Cust.cancelBooking();
    	
    }
}
