package com.rest.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
//@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "mycourses")
public class Course {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int courseID;
//	@NotBlank(message="Course Name cannot be blank")
	String courseName;
//	@NotBlank(message="Course duration cannot be blank")
	int duration;
//	@Pattern(regexp)
//	String mobileno;
	public Course(int courseID, @NotBlank(message = "Course Name cannot be blank") String courseName,
			@NotBlank(message = "Course duration cannot be blank") int duration) {
		super();
		this.courseID = courseID;
		this.courseName = courseName;
		this.duration = duration;
	}
}
