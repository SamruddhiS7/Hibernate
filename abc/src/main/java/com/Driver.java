package com;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Driver {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
//		Student s = new Student();
//		s.setName("Albert");
//		
//		et.begin();
//		em.persist(s);
//		et.commit();
		
//		et.begin();
//		Student s = em.find(Student.class, 3);
//		System.out.println(s);
//		if(s!=null) {
//			System.out.println(s.getName());
//			s.setName("Aron");
//			em.merge(s);
//			et.commit();
//		}
		
//		et.begin();
//		Student s = em.find(Student.class, 2);
//		em.remove(s);
//		et.commit();
		
//WA Hibernate code to fetch all the details from the table	
		
		String jpql = "select s from Student s";
		et.begin();
		Query query = em.createQuery(jpql); 
		List<Student> li = query.getResultList();
		System.out.println(li);
		et.commit();
		

//		String sql = "select * from student";
//		
//		Query query = em.createNativeQuery(sql); 
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
