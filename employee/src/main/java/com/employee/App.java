package com.employee;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.employee.beans.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        
        Employee emp=context.getBean(Employee.class);
//        System.out.println(emp);
        emp.ShowEmpDetails();

    }
}
