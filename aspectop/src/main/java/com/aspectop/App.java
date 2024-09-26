package com.aspectop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import com.aspectop.beans.User;
import com.aspectop.config.Config;
import com.aspectop.beans.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(Config.class);
    	
    	Employee e=context.getBean(Employee.class);
    	e.setEmpId(1);
    	e.setEmpName("Prathamesh");
    	e.showDetails();
    	e.showERR();
    }
}
