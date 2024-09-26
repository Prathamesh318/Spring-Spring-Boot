package com.book.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.book.Model.Author;
import com.book.Model.Book;
import com.book.dao.AuthorRepo;


@Service
public class AuthorService {
	@Autowired
	AuthorRepo authorrepo;
	
	public	List<Author> getAllAuthors(){
		List<Author>author=null;
		try {
			author=this.authorrepo.findAll();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return author;
		
	}
	
	public Author getAuthorById(int id) {
		Author author=null;
		try {
			author=this.authorrepo.findById(id).get();
			if(author==null) {
				System.out.println("NO AUTHOR FOUND");
				return null;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return author;
	}
	
	public Author addAuthor(Author a) {
		Author author=null;
		try {
			author=this.authorrepo.save(a);
			if(author==null) {
				System.out.println("Author could not be added !");
				return null;
			}
			System.out.println(author.toString());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return author;
	}
}
