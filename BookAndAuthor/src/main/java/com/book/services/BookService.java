package com.book.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.book.Model.Book;
import com.book.dao.BookRepo;


@Service
public class BookService{
	@Autowired
	BookRepo bookrepo;
	
	
	public	List<Book> getAllBooks(){
		List<Book>book=null;
		try {
			book=this.bookrepo.findAll();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return book;
		
	}
	
	public Book getBookById(int id) {
		Book book=null;
		try {
			book=this.bookrepo.findById(id).get();
			if(book==null) {
				System.out.println("NO AUTHOR FOUND");
				return null;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return book;
	}
	
	public Book addBook(Book b) {
		Book book=null;
		try {
			book=this.bookrepo.save(b);
			if(book==null) {
				System.out.println("Author could not be added !");
				return null;
			}
			System.out.println(book.toString());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return book;
	}

}
