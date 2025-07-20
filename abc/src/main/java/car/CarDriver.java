package car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CarDriver {
//	EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
//	EntityManager em = emf.createEntityManager();
//	EntityTransaction et = em.getTransaction();
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Car c = new Car();
		Engine e = new Engine();
		
		e.setType("Hybrid");
		e.setCc(1671);
		
		c.setBrand("Suzuki");
		c.setPrice(236789);
		c.setEngine(e); //Assigning Engine Values
		
		et.begin();
//		em.persist(e);
		em.persist(c);
		et.commit();
		
	}

}
