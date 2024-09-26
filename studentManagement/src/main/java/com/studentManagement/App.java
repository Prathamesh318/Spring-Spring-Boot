package com.studentManagement;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.studentManagement.beans.Courses;
import com.studentManagement.beans.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Config.xml");
//    	
//    	Student stud1=context.getBean(Student.class);
    	
    	
//    	stud1.showStudDetails();
    	
    	 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
         Student student = (Student) context.getBean("student1");

         System.out.println("Student Details:");
         System.out.println("ID: " + student.getStudId());
         System.out.println("Name: " + student.getStudName());
         System.out.println("Courses:");

         for (Courses course : student.getCourses()) {
             System.out.println("\t- " + course.getCourseId() + ": " + course.getCourseName());
         }

         context.close();
    }
}
