package com.example.JPA2.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@ToString
@Setter
@Table(name="trainer_table")

public class Trainer {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int trainerId;
		@NotBlank(message="Trainer Name can not be empty")
		@Size(min=3,message="Name should be greater or equal to 3")
		private String trainerName;
		@Size(min=3,message="Email should be greater or equal to 10")
		private String email;
}
