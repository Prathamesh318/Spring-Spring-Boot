package com.spring.expressdepartment.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.expressdepartment.beans.Department;
import com.spring.jdbcprac.beans.Product;

public interface HodDep {
	
	public int addDepartment(Department p);
	
	public int addDepartment(int id);
	
	public int deleteProduct(int id);
	public Product getProduct(int id);
	
	public List<Product> getAllProduct();
	
	
	
}
