package com.universtiy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.universtiy.beans.Students;
import com.universtiy.beans.University;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    	
    	University uni=context.getBean(University.class);
//    	Students stud1=new Students("Prathamesh",1);
//    	Students stud2=new Students("Damon",2);
    	
    	Students stud1=(Students) context.getBean("Student1");
    	Students stud2=(Students) context.getBean("Student2");
    	
    	
    	uni.enrollStudent(stud1,"Web Development");
    	uni.enrollStudent(stud2,"Data Science and ML");
    }
}
