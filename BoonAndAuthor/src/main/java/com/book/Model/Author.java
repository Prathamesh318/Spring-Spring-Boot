package com.book.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="author_table")
public class Author {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int auhtId;
	@NotBlank(message="First Name cannot be blank")
	private String firstName;
	@NotBlank(message="Last Name cannot be blank")
	private String lastName;
	@NotBlank(message="Date of birth required")
	private String dob;
}
