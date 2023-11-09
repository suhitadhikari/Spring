package com.suhit_project.Spring.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.suhit_project.Spring.Entities.Alien;

public class AlienDao {
	
	public void saveAlien(Alien alien) {
        // Create a Hibernate configuration
        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);

        // Create a SessionFactory
        SessionFactory sf = con.buildSessionFactory();

        // Create a Session
        Session session = sf.openSession();

       
        // Save the Alien object
        session.save(alien);

    }
	
}