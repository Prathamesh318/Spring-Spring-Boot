package com.infosys.jpademo.dao;

import org.springframework.stereotype.Repository;

import com.infosys.jpademo.beans.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.PersistenceUnit;

@Repository
public class EmployeeDao {

	EntityManagerFactory emf;
	
	@PersistenceUnit  //Expresses a dependency on an EntityManagerFactory and itsassociated persistence unit
	public void setEmf(EntityManagerFactory emf) {
		this.emf = emf;
	}


	public Employee addEmployee(Employee e) {
		// creating entity manager object
		// we create with the help of entity manager factory
		// factory design pattern  ( factory means product something use that)
		// entity manager is responsible for life cycle of entity
		// entity manager is used to allow the application to manage and search for the entities to the 
		// relational database. It manages the lifecycle of entity instances.
		// An entity manager object manages the set of entities that are defined by persistence unit.
		//4 States: 1. New / transient, 2.managed / pesistent, 3. detached / unmanaged, 4. remove
		EntityManager em = emf.createEntityManager();
		//begin transaction to make changes
		em.getTransaction().begin();
		// changing state from new to persist/managed
		em.persist(e); // to save object to entity
		//commit the current resource transaction
		em.getTransaction().commit();
		return e;
		
	}
}
