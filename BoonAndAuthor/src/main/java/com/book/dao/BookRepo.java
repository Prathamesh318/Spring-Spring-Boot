package com.book.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book.Model.Book;


@Repository
public interface BookRepo extends JpaRepository<Book, Integer>{

}
