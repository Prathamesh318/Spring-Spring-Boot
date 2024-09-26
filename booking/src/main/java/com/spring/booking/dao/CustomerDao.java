package com.spring.booking.dao;

import com.spring.booking.beans.Customers;

public interface CustomerDao {
	public int addFlight(Customers c);
	public int updateCust();
	public int cancelBooking();
}
