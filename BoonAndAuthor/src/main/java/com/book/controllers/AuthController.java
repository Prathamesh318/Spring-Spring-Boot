package com.book.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.book.Model.Author;
import com.book.services.AuthorService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("bookandauthorservice")
public class AuthController {
	
	@Autowired
	AuthorService authorservice;
	
	@PostMapping("/api/authors")
	
	public ResponseEntity<Author> addAuthor(@Valid @RequestBody Author auth){
		System.out.println(auth.toString());
		try {
			Author a=authorservice.addAuthor(auth);
			if(a==null) {
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(a);
			}
			
			return ResponseEntity.status(HttpStatus.CREATED).body(a);
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		
	}
	@GetMapping("/api/author")
	public ResponseEntity<Author> getAuthor(@RequestParam int id){
		
		try {
			Author a=authorservice.getAuthorById(id);
			if(a==null) {
				return ResponseEntity.status(HttpStatus.NO_CONTENT).body(a);
			}
			System.out.println(a.toString());
			
			return ResponseEntity.status(HttpStatus.FOUND).body(a);
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		
	}
	@GetMapping("/api/authors")
	public ResponseEntity<List<Author>> getAllAuthor(){
		List<Author>auth=null;
		try {
			auth=authorservice.getAllAuthors();
			if(auth==null) {
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			}
			
			return ResponseEntity.status(HttpStatus.CREATED).body(auth);
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		
	}
	
	
}
