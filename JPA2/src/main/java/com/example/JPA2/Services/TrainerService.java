package com.example.JPA2.Services;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.JPA2.DAO.TrainerRepo;
import com.example.JPA2.Entities.Trainer;

@Service
public class TrainerService implements TrainerServiceInterface{
	
	@Autowired
	TrainerRepo trainerRepo;
	
	@Override
	public void addNewTrainer(Trainer t) {
		try {
			trainerRepo.save(t);
			System.out.println("New trainer info added successfully");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Exception trainer object failed to save"+e);
		}
	}
	@Override
	public void findTrainerByid(int tid) {
		
//		 Optional<Trainer> otrainer=trainerRepo.findById(tid);
//		 Trainer trainer=otrainer.get();
		
		Trainer t=trainerRepo.findById(tid).get();
		if(t!=null) {
			System.out.println("Trainer Name is:"+t.getTrainerName());
			System.out.println("Trainer Email is:"+t.getEmail());
		}
		else {
			System.out.println("No trainer found Invalid trainer id");
		}
	}
	
	@Override
	public void updateTrainer(int id) {
		Trainer t=trainerRepo.findById(id).get();
		System.out.println("Enter the new email");
		Scanner sc=new Scanner(System.in);
			String email=sc.next();
			t.setEmail(email);
			trainerRepo.save(t);
	}
	@Override
	public void deleteTrainer(int id) {
		Trainer t=trainerRepo.findById(id).get();
		trainerRepo.delete(t);
		
	}
	@Override
	public List<Trainer> findAllTrainer(){
		List<Trainer>list=trainerRepo.findAll();
		
		return list;
		
	}
}
