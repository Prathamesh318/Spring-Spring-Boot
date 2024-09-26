package com.infosys.springbootmvcdemo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.springbootmvcdemo.DAO.TrainerRepo;
import com.infosys.springbootmvcdemo.Model.Trainer;

@Service
public class TrainerServiceImplementation implements TrainerService {
	
	@Autowired
	TrainerRepo trainerRepo;

	@Override
	public void trainerSignUp(Trainer trainer) {
		// TODO Auto-generated method stub
	try {	
	    Trainer t =	trainerRepo.save(trainer);
	    if(t!=null)
	    {
	    	System.out.println("SignUp successfull");
	    }
	}
	catch (Exception e) {
		 System.err.println("SignUp Failed"+e);
	   }
	}

	@Override
	public List<Trainer> showAllTrainer() {
		// TODO Auto-generated method stub
		
	List<Trainer> list=trainerRepo.findAll();

		return list;
		
	}
	
	public void removeTrainer(int id) {
		try {
			this.trainerRepo.deleteById(id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Operation failed");
		}
	}

}
