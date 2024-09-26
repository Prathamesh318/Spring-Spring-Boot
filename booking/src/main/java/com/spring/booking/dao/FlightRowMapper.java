package com.spring.booking.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.booking.beans.Flights;



public class FlightRowMapper  implements RowMapper<Flights>{

	@Override
	public Flights mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Flights flight=new Flights();
		flight.setPnr(rs.getString(1));
		flight.setName(rs.getString(2));
		flight.setDepart(rs.getString(3));
		flight.setArrive(rs.getString(4));
		flight.setDate(rs.getString(5));
		
		return flight;
	}

}
