package com.spring.jdbcprac.dao;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbcprac.beans.Product;


@Component
public class ProductService implements ProductDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int addProduct(Product p) {
		// TODO Auto-generated method stub
		String query="Insert into product values(?,?,?,?)";
		
		return this.jdbcTemplate.update(query,p.getProductId(),p.getProductName(),p.getProductQuantity(),p.getProductPrice());
		
	
	}
	@Override
	public Product getProduct(int id) {
		// TODO Auto-generated method stub
		
		String query="Select * From product where pid=?";
		RowMapper<Product> rowMapper=new RowMapperImpl();
		Product p=this.jdbcTemplate.queryForObject(query, rowMapper,id);
		return p;
	}
	@Override
	public int updateQuantity(int id) {
		// TODO Auto-generated method stub
		String query="update product set quantity=? where pid=?";
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the  quantity");
		int quantity=sc.nextInt();
		return this.jdbcTemplate.update(query,quantity,id);
	}
	@Override
	public int deleteProduct(int id) {
		// TODO Auto-generated method stub
		String query="Delete from product where pid=?";
		
		
		return this.jdbcTemplate.update(query,id);
	}
	
	@Override
	public List<Product> getAllProduct() {
		String query="Select * from product";
		List<Product> list=this.jdbcTemplate.query(query,new RowMapperImpl());
		return list;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	

}
