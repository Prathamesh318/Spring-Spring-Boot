package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.Student;  


@Component
public class StudentDao {  
	@Autowired
private JdbcTemplate jdbcTemplate;  
  


public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	System.out.println("Inside Setter");
    this.jdbcTemplate = jdbcTemplate;  
}  
  
public int saveStudent(Student s){  
    String query="insert into student values(?,?,?)";  
    return jdbcTemplate.update(query,s.getId(),s.getName(),s.getCity());  
}  


public void showStudents() {
	
	String query="select * from student";
	 jdbcTemplate.execute(query);
}

public int updateStudents(Student s) {
	
	String query="Update student set name=?, city=? where id=?";
	return this.jdbcTemplate.update(query,s.getName(),s.getCity(),s.getId());
}
public int deleteStudents(int id) {
	String query="delete from student where id=?";
	
	return this.jdbcTemplate.update(query,id);
}

public Student getStudent(int studentId) {
	
	String query="Select * from student where id=?";
	RowMapper<Student>rowMapper=new RowMapperImpl();
	
	return this.jdbcTemplate.queryForObject(query, rowMapper,studentId);
}
public List<Student> getAllStudents(){
	String query="Select * from student";
	List<Student> list=this.jdbcTemplate.query(query,new RowMapperImpl());
	
	return list;
}
  
}  
