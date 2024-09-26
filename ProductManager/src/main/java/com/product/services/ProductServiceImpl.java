package com.product.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

import com.product.dao.ProductRepo;
import com.product.model.Product;
@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductRepo productRepo;
	
	@Override
	public Product addProduct(Product P) {
		// TODO Auto-generated method stub
		try {
			Product addedProduct=this.productRepo.save(P);
			return addedProduct;			
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public Product findProductById(int id) {
		try {
			Product product=this.productRepo.findById(id).get();
			
			return product;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
			// TODO: handle exception
		}
	}
	@Override
	public List<Product> showAllProducts() {
		try {
			List<Product> plist=this.productRepo.findAll();
			for(Product p:plist) {
				System.out.println(p.getName());
			}
			return plist;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		
	}
	@Override
	public void deleteProduct(int id) {
		try {
			this.productRepo.deleteById(id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	@Override
	public int updateProduct(int id ,int quantity) {
		try {
			Product p=this.productRepo.findById(id).get();
			System.out.println(p.getQuantity());
			p.setQuantity(quantity);
			System.out.println(p.getQuantity());
			this.productRepo.save(p);
			
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

}
