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
import com.book.Model.Book;
import com.book.services.BookService;

import jakarta.validation.Valid;

@RestController

public class BookController {
	@Autowired
	BookService bookservice;
	
	@PostMapping("/api/books")
	
	public ResponseEntity<Book> addBook(@Valid @RequestBody Book book){
		System.out.println(book.toString());
		try {
			Book a=bookservice.addBook(book);
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
	@GetMapping("/api/book")
	public ResponseEntity<Book> getAuthor(@RequestParam int id){
		
		try {
			Book book=bookservice.getBookById(id);
			if(book==null) {
				return ResponseEntity.status(HttpStatus.NO_CONTENT).body(book);
			}
			System.out.println(book.toString());
			
			return ResponseEntity.status(HttpStatus.FOUND).body(book);
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		
	}
	@GetMapping("/api/books")
	public ResponseEntity<List<Book>> getAllAuthor(){
		List<Book>book=null;
		try {
			book=bookservice.getAllBooks();
			if(book==null) {
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			}
			
			return ResponseEntity.status(HttpStatus.CREATED).body(book);
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		
	}
}
