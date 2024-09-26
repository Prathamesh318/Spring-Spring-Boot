package com.infosys.diexample1.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Library {
	int libId=1;
	String libName="Library 1";
	Book book;
//	@Autowired(required=false)
//	public Library(int libId, String libName, Book book) {
//		super();
//		this.libId = libId;
//		this.libName = libName;
//		this.book = book;
//	}
//	
//	
//	public Library(int libId,String libName) {
//		super();
//		this.libId = libId;
//		this.libName = libName;
//	}
	
	@Autowired //Constructor Injection
	public Library(Book book) {
		this.book=book;
	}
	public void showDetails() {
		System.out.println("Library Id:"+libId);
		System.out.println("Library Name:"+libName);
		book.bookDetails();
	}
}

