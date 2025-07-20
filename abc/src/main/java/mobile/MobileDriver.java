package mobile;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class MobileDriver {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public static void main(String[] args) {
		
		MobileDriver md = new MobileDriver();
//		md.assignValue();
		md.fetchMobile();
		
		
	}
	
	public void assignValue() {
		Battery b = new Battery();
		b.setMah(7000);
		
		Mobile m = new Mobile();
		m.setBrand("Vivo");
		m.setPrice(11000);
		m.setBattery(b);
		
		et.begin();
		em.persist(b);
		em.persist(m);
//		em.persist(b);
		et.commit();
		
	}

	public void fetchMobile() {
		et.begin();
		Query query = em.createQuery("select m from Mobile m");
		List<Mobile> li =query.getResultList();
		li.forEach(i->System.out.println(i+" "+i.getBattery().getMah()));
		et.commit();
	}
	
	
}
