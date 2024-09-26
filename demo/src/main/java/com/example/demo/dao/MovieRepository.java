package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Movie;

public interface MovieRepository  extends JpaRepository<Movie, Integer>{

	
	public Movie findById(int id);
	
}
