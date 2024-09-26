package com.library.beans;

import java.util.ArrayList;
import java.util.List;

public class Library {
     List<Books> books;
     String libName;

    public String getLibName() {
		return libName;
	}

	public void setLibName(String libName) {
		this.libName = libName;
	}

	public Library() {
        this.books = new ArrayList<>();
    }

    // Setter for dependency injection
    public void setBooks(List<Books> books) {
        this.books = books;
    }

    public void addBook(Books book) {
        books.add(book);
    }

    public void showBooks() {
    	System.out.println("Library Name :"+this.getLibName());
    	System.out.println("Libray contains following books :");
        for (Books book : books) {
            System.out.println(book);
        }
    }
}