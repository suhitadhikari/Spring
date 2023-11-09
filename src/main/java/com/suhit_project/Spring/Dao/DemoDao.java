package com.suhit_project.Spring.Dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoDao {
	private static final Logger log = LoggerFactory.getLogger(DemoDao.class);
	
	//EntityManagerFactory emf = Persistence.
	
	//EntityManagerFactory emf = Persistence.create
	
	/*
	 * @PersistenceContext private EntityManager entityManager;
	 */
	
	/*
	 * public String getArtistname(int artistId) { try { Query nativeQuery =
	 * entityManager.
	 * createNativeQuery("SELECT name FROM Artist WHERE ArtistId = :artistId");
	 * nativeQuery.setParameter("artistId", artistId);
	 * 
	 * // Execute the query and get the result String result = (String)
	 * nativeQuery.getSingleResult(); return result; } catch (Exception e) {
	 * log.info("Failing Silently"); throw e; // Re-throw the exception after
	 * rollback }
	 * 
	 * }
	 */
	
	public static void bubbleSort(int array[]) {
		int temp = 0;
		int size = array.length;
		for(int i=0;i<size;i++) {
		for(int j=0;j<size-i-1;j++) {
			if(array[j]>array[j+1]) {
				temp= array[j];
				array[j]=array[j+1];
				array[j+1]=temp;
				
			}
			
		}
	}
		System.out.println("After Sorted:-------------");
		for(int i :array) {
			System.out.println(i);
		}
}
	
	public static String evenOrOdd(int num) {
		if(num%2==0) {
			System.out.println("Number is even");
		}
		else {
			System.out.println("Number is Odd");
		}
		return null;
		
	}
}
