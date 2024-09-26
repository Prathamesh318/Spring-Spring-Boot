package com.smart.Entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@NotBlank(message="User name cannot be empty")
	@Size(min=2,max=20,message="Minimum 2 and Maximum 20 characters are allowed")
	private String name;
	@Column(unique=true)

	@NotBlank(message="Email field is required")
	private String email;
	@Size(min=8,max=8,message="Password should be of length 8")
	private String password;
	private String role;
	private boolean enabled;
	private String imageUrl;
	@Column(length =500)
	@Size(max=200)
	private String about;
	@OneToMany(cascade=CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "user")
	private List<Contact>contacts=new ArrayList<>();

}
