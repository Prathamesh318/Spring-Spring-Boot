package com.example.JPA2.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.JPA2.Entities.Trainer;
//CURD Repository : save() ,saveAll(),findById,findAll,deleteById,deleteAll
//JPARepository <TypeObject,primarykeydatatype>
//jparepository


@Repository
public interface TrainerRepo extends JpaRepository<Trainer, Integer>{
	
	List<Trainer> findByTrainerName(String name);
	List<Trainer> findByEmail(String email);
	
	@Query("Select t from Trainer t where t.email=?1")
	List<Trainer> findbyemail(String email);
	

}
