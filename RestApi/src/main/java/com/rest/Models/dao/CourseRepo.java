package com.rest.Models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.Models.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course, Integer> {

}
