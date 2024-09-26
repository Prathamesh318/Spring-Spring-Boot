package com.infosys.project2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.infosys.diexample1.beans.Person;
import com.infosys.diexample1.config.Config;
import com.infosys.project2.beans.Employee;
import com.infosys.project2.beans.Employee1;


public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context
    	=new AnnotationConfigApplicationContext(Config.class);
    	
    	Employee emp=context.getBean(Employee.class);
    	emp.showEmpDetails();
    	
    	Employee1 emp1=context.getBean(Employee1.class);
    	
    	emp1.showEmployeeDetails();
    	
    }
}
