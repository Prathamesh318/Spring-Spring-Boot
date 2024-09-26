package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entities.Movie;
import com.example.demo.services.MovieService;

@Controller
public class MovieController {
	
	@Autowired
	MovieService movieservice;
	
	
	@GetMapping("movies/{movieId}")
	public ResponseEntity<Movie>getMovie(@PathVariable("movieId") int movieId){
		try {
			Movie m=this.movieservice.getMovieById(movieId);
			System.out.println(m);
			return ResponseEntity.status(HttpStatus.FOUND).body(m);
		}
		catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}
	@GetMapping("movies")
	public ResponseEntity<List<Movie>> getAllMovies(){
		try {
			List<Movie> list=this.movieservice.getAllMovies();
			
			return ResponseEntity.status(HttpStatus.FOUND).body(list);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}
	
	@PostMapping("/movies")
	public ResponseEntity<Movie> addMovie(@RequestBody Movie m){
		Movie b=null;
		try {
			b=this.movieservice.addMovie(m);
			System.out.println(b);
			return ResponseEntity.status(HttpStatus.CREATED).build();
		}
		catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	@DeleteMapping("/movies/{movieId}")
	public ResponseEntity<Void>deleteMovie(@PathVariable("movieId") int movieId){
		try {
			this.movieservice.deleteMovie(movieId);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	@PutMapping("/movies/{movieId}/{movieGenre}")
	public ResponseEntity<Void>updateMovieGenre(@PathVariable("movieId") int movieId,@PathVariable("movieGenre") String movieGenre){
		try {
			this.movieservice.updateMovieGenre(movieId,movieGenre);
			return ResponseEntity.status(HttpStatus.ACCEPTED).build();
		}
		catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

}
