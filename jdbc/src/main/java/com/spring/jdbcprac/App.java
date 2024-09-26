package com.spring.jdbcprac;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.spring.jdbcprac.beans.Product;
import com.spring.jdbcprac.config.Config;
import com.spring.jdbcprac.dao.ProductService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
        
        Product p1=context.getBean(Product.class);
        
        
        
        
        ProductService ps=context.getBean(ProductService.class);
        		
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 to add product");
        System.out.println("Enter 2 to update product");
        System.out.println("Enter 3 to delete product");
        System.out.println("Enter 4 to show single product detail");
        System.out.println("Enter 5 to show product all product details");
        
        int ch=sc.nextInt();
        
        switch (ch) {
		case  1: {
			
			Product p=new Product();
			p.setProductId(1);
			p.setProductName("Tea Powder");
			p.setProductQuantity(200);
			p.setProductPrice(5);
			
			int res=ps.addProduct(p);
			System.out.println("Product Addes"+res);
			break;
		}
		
		case 2:{
			System.out.println("Enter the product id to update quantity");
			int id=sc.nextInt();
			int res=ps.updateQuantity(id);
			if(res!=0)
				System.out.println("Updation done successfully");
			break;
		}
		case 3:{
			System.out.println("Enter the product id to delete ");
			int id=sc.nextInt();
			int res=ps.deleteProduct(id);
			if(res!=0)
				System.out.println("Deletion done successfully");
			break;
		}
		case 4:{
			System.out.println("Enter the product id to get details ");
			int id=sc.nextInt();
			Product p=ps.getProduct(id);
			System.out.println(p);
			break;
		}
		case 5:{
			
			List<Product>p=ps.getAllProduct();
			
			for(Product pro:p) {
				System.out.println(pro);
				
			}
//			System.out.println(p);
			break;
			
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + ch);
		}
        
        
    }
}
