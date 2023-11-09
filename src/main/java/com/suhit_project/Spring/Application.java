package com.suhit_project.Spring;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.suhit_project.Spring.Dao.AlienDao;
import com.suhit_project.Spring.Dao.DemoDao;
import com.suhit_project.Spring.Entities.Alien;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        int array[]= {2,5,3,8,4};
        System.out.println("Before Sorting:-------------");
        for(int i:array) {
        	System.out.println(i);
        }
        DemoDao.bubbleSort(array);
        DemoDao.evenOrOdd(5);
        
        System.out.println("---------JPA STUFF-------------");
        AlienDao alienDao = new AlienDao();

        // Create an Alien instance and set its properties
        Alien alien = new Alien();
        alien.setaName("Shiva"); // Set the appropriate property values

        // Save the Alien
        alienDao.saveAlien(alien);
    }
}
