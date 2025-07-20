package com;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class EmpDriver {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	public static void main(String[] args) {
		EmpDriver ed = new EmpDriver();
		ed.fetchEmp();
//		ed.fetchDelimiter();
//		ed.variableFetch();
		
		
		
	}
	
	public void setEmp() {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
//		EntityManager em = emf.createEntityManager();
//		EntityTransaction et = em.getTransaction();
		
		Emp e = new Emp();
		e.setName("Rida");
		e.setSal(20000);
		et.begin();
		em.persist(e);
		et.commit();
			
	}
	
	public void fetchEmp() {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
//		EntityManager em = emf.createEntityManager();
//		EntityTransaction et = em.getTransaction();
	
		String jpql = "select e from Emp e";
		et.begin();
		Query query = em.createQuery(jpql);
		List<Emp> li = query.getResultList();
		li.forEach(i->System.out.println(i.getName()+" "+i.getId()));
		et.commit();
	}
	
	public void fetchDelimiter() {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
//		EntityManager em = emf.createEntityManager();
//		EntityTransaction et = em.getTransaction();
		
		String jpql = "select e from Emp e where e.sal=?1 and e.id=?2";
		et.begin();
		Query query = em.createQuery(jpql);
		query.setParameter(1, 20000);
		query.setParameter(2,  2);
		List<Emp> li = query.getResultList();
		li.forEach(i->System.out.println(i.getName()));
		et.commit();
		
	}
	
	public void variableFetch() {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
//		EntityManager em = emf.createEntityManager();
//		EntityTransaction et = em.getTransaction();
		
		String jpql = "select e from Emp e where e.sal=:empSal and e.name=:empName";
		et.begin();
		Query query = em.createQuery(jpql);
		query.setParameter("empSal", 20000);
		query.setParameter("empName",  "Smith");
		List<Emp> li = query.getResultList();
		li.forEach(i->System.out.println(i.getName()));
		et.commit();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
