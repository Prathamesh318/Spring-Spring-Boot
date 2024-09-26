package com.smart.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="contact")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cId;
	private String name;
	private String secondName;
	@Column(length = 500)
	private String work;
	@Column(unique = true)
	private String email;
	@Column(unique = true)
	private String phone;
	private String image;
	@Column(length = 5000)
	private String description;
	@ManyToOne
	private User user;
}
