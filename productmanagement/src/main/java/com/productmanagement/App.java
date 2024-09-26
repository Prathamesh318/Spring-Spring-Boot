package com.productmanagement;

/**
 * Hello world!
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.productmanagement.beans.Product;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        Product product1 = (Product) context.getBean("product1");
        System.out.println("Product ID: " + product1.getId());
        System.out.println("Product Name: " + product1.getName());
        System.out.println("Brand ID: " + product1.getBrand().getId());
        System.out.println("Brand Name: " + product1.getBrand().getName());
//
//
        Product product2 = (Product) context.getBean("product2");
        System.out.println("Product ID: " + product2.getId());
        System.out.println("Product Name: " + product2.getName());
        System.out.println("Brand ID: " + product2.getBrand().getId());
        System.out.println("Brand Name: " + product2.getBrand().getName());
//        System.out.println("Product 1: " + product1.getName() + ", Brand: " + product1.getBrand().getName());
//        System.out.println("Product 2: " + product2.getName() + ", Brand: " + product2.getBrand().getName());
        		
    }
    
}
