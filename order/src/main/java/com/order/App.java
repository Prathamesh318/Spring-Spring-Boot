package com.order;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.order.beans.Orders;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    	
    	Orders order1=context.getBean(Orders.class);
    	
    	order1.showOrderDetails();
    }
}
