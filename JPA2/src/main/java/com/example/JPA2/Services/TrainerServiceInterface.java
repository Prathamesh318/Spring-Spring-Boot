package com.example.JPA2.Services;

import java.util.List;

import com.example.JPA2.Entities.Trainer;

public interface TrainerServiceInterface {

	void addNewTrainer(Trainer t);

	void findTrainerByid(int tid);

	void updateTrainer(int id);

	void deleteTrainer(int id);

	List<Trainer> findAllTrainer();

}
