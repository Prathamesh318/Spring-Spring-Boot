package com.book.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="book_table")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bookId;
	@NotBlank(message="Title field required")
	private String title;
	@NotBlank(message="Isbn field required")
	@Size(max=10,min=10,message="ISBN Number should be 10 digit")
	private String isbn;
	@NotBlank(message="Publish Date field required")
	private String publishDate;
	
}
