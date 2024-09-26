package com.example.demo.services;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.MovieRepository;
import com.example.demo.entities.Movie;


@Service
public class MovieService {
	
	@Autowired
	private MovieRepository movierepository;
	Scanner sc=new Scanner(System.in);
	
	public List<Movie> getAllMovies(){
		List<Movie> list= this.movierepository.findAll();
		
		return list;
	}
	
	public Movie getMovieById(int id) {
		Movie m=this.movierepository.findById(id);
		return m;
	}
	
	public Movie addMovie(Movie m) {
		Movie movie=this.movierepository.save(m);
		return movie;
		
	}
	
	public void deleteMovie(int id) {
		this.movierepository.deleteById(id);
	}
	
	public void updateMovieGenre(int id,String movieGenre) {
		
		Movie m=this.movierepository.findById(id);
		m.setMovieGenre(movieGenre);
		this.movierepository.save(m);
		
	}

}
