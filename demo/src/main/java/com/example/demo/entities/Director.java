package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity  
@Table(name="directors")
public class Director {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int directorId;
	private String firstName;
	private String lastName;
	private int directorAge;
	@OneToOne(mappedBy = "director" )
	@JsonBackReference
	private Movie movie;
	public Director() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Director(int directorId, String firstName, String lastName, int directorAge, Movie movie) {
		super();
		this.directorId = directorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.directorAge = directorAge;
		this.movie = movie;
	}

	public int getDirectorId() {
		return directorId;
	}
	public void setDirectorId(int directorId) {
		this.directorId = directorId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getDirectorAge() {
		return directorAge;
	}
	public void setDirectorAge(int directorAge) {
		this.directorAge = directorAge;
	}
	
}
