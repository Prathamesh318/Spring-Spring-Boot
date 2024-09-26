package com.example.JPA2;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.JPA2.DAO.TrainerRepo;
import com.example.JPA2.Entities.Trainer;
import com.example.JPA2.Services.TrainerService;

@SpringBootApplication
public class Jpa2Application implements CommandLineRunner{
	@Autowired
	TrainerService trainerservice;
	@Autowired
	TrainerRepo trainerRepo;
	public static void main(String[] args) {
		SpringApplication.run(Jpa2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
	
		
		int loop=1;
		while(loop==1) {
			System.out.println("Enter 1 to add new trainer");
			System.out.println("Enter 2 to find trainer by id");
			System.out.println("Enter 3 to update trainer email");
			System.out.println("Enter 4 to delete trainer");
			System.out.println("Enter 5 to find all trainer");
			int ch=sc.nextInt();
			switch (ch) {
			case 1: {
				System.out.println("Enter the trainer name:");
				String name=sc.next();
				System.out.println("Enter the email:");
				String email=sc.next();
				Trainer trainer=new Trainer();
				trainer.setTrainerName(name);
				trainer.setEmail(email);
				trainerservice.addNewTrainer(trainer);
				break;
			}
			case 2: {
//				System.out.println("Emter the trainer id:");
//				int id=sc.nextInt();
//				trainerservice.findTrainerByid(id);
				System.out.println("Enter the name:");
				String name=sc.next();
				List<Trainer>l=trainerRepo.findByTrainerName(name);
				l.forEach(trainer->System.out.println(trainer));
			break;
			}
			case 3:{
				System.out.println("Enter the Id of trainer");
				int id=sc.nextInt();
				trainerservice.updateTrainer(id);
				break;
			}
			case 4:{
				System.out.println("Enter the Id of trainer");
				int id=sc.nextInt();
				trainerservice.deleteTrainer(id);
				break;
				
			}
			case 5:{
				List<Trainer> t=trainerservice.findAllTrainer();
				for(Trainer trai:t) {
					System.out.println("Trainer name"+trai.getTrainerName());
					System.out.println("Trainer email"+trai.getEmail());
					System.out.println();
					
				}
				break;
			}
			case 6:{
				System.out.println("Enter the email");
				String email=sc.next();
				List<Trainer>t=trainerRepo.findbyemail(email);
				t.forEach(trainer->System.out.println(trainer));
				
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}
			System.out.println("Do you want to conitnue? 1:0");
			loop=sc.nextInt();
		}
		
	}

}
