package com.spring.jdbcprac.dao;

import java.util.List;

import com.spring.jdbcprac.beans.Product;

public interface ProductDao {
		
	public int addProduct(Product p);
	
	public int updateQuantity(int id);
	
	public int deleteProduct(int id);
	public Product getProduct(int id);
	
	public List<Product> getAllProduct();
}
