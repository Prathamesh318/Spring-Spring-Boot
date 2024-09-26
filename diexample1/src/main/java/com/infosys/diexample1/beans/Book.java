package com.infosys.diexample1.beans;

public class Book {
	String bookName;
	int bookId;
	String bookAuthor;
	
	Book(){
		
	}

	public Book(String bookName, int bookId, String bookAuthor) {
		super();
		this.bookName = bookName;
		this.bookId = bookId;
		this.bookAuthor = bookAuthor;
	}
	void bookDetails() {
		System.out.println("Book Name :"+bookName);
		System.out.println("Author Name :"+bookAuthor);
		System.out.println("Book Id :"+bookId);
	}
}

