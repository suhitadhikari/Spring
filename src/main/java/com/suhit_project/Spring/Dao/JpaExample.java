package com.suhit_project.Spring.Dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaExample {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyPersistenceUnit");
	EntityManager em = emf.createEntityManager();

}
