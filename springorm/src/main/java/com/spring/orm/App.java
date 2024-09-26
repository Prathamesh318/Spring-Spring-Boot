package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        
        StudentDao s=context.getBean(StudentDao.class);
        Student Stud=new Student(1,"Prathamesh","Pune");
        int status=s.insert(Stud);
        
        System.out.println(status);
    }
}
