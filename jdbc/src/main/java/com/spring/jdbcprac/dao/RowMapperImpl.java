package com.spring.jdbcprac.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbcprac.beans.Product;



public class RowMapperImpl  implements RowMapper<Product>{

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Product product=new Product();
		product.setProductId(rs.getInt(1));
		product.setProductName(rs.getString(2));
		product.setProductQuantity(rs.getInt(3));
		product.setProductPrice(rs.getInt(4));
		
		return product;
	}

}