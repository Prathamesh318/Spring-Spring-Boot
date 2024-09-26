package com.infosys.firstproject;

import java.io.ObjectInputFilter.Config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infosys.firstproject.beans.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Employee employee=new Employee();
       employee.setEmpId(101);
       employee.setEmployeeName("Prathamesh");
       AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
       Employee emp=context.getBean(Employee.class);
       System.out.println("Employee name"+emp.getEmployeeName());
       String s =context.getBean(String.class);
       System.out.println(s);
    }
}
