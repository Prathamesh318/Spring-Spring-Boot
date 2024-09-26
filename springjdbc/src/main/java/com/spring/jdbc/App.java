package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;

public class App {
	
	public static void main(String[] args) {

		System.out.println("My program started");
		
//		Spring jdbc template
		
		ApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfig.class);
		
		StudentDao sao=context.getBean(StudentDao.class);
		
//		int status=sao.saveStudent(new Student(104,"Pratham","Pune"));
		
		sao.showStudents();
		
		
//		int status=sao.updateStudents(new Student(102,"Prathammm","bangalore"));
//		System.out.println(status);
		
		int stat=sao.deleteStudents(102);
		
		Student s=sao.getStudent(111);
		System.out.println(s);
		
		List<Student>l=sao.getAllStudents();
		
		for(Student Stud:l) {
			System.out.println(Stud);
			
		}
		
		
		
		

		
	}
	
}
