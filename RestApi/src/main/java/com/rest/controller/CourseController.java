package com.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rest.Models.Course;
import com.rest.Models.CourseResponse;
import com.rest.Models.dao.CourseRepo;

import jakarta.validation.Valid;

@RestController
public class CourseController {
		
	@Autowired
	CourseRepo courseRepo;
	@GetMapping("/home")
	public String myHome() {
		return "Welcome";
	}
	
	@GetMapping("/")
	public CourseResponse myHome1() {
		
		CourseResponse response=new CourseResponse();
		response.setCode(200);
		response.setMessage("Welcome in spring learning");
		return response;
	}
	
	@PostMapping("/addCourse")
	public ResponseEntity<Course> post(@Valid @RequestBody Course course) {
		
		this.courseRepo.save(course);
		System.out.println(course.getCourseName());
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	@GetMapping("/getCourse")
	public ResponseEntity<Course> getCourse(@RequestParam("id") int id) {
		
		
		System.out.println(id);
		Course course=this.courseRepo.findById(id).get();
		System.out.println(course.getCourseName());
		return ResponseEntity.status(HttpStatus.CREATED).body(course);
	}
	
}
