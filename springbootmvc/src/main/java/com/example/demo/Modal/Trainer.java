package com.example.demo.Modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Trainer {
	private int trainerId;
	private String trainerName;
	private String trainerEmail;
	private String trainerPass;
	private int exp;
}
