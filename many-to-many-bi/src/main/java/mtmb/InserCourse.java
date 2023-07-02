package mtmb;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InserCourse {
	public static void main(String[] args) {
		
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("uday");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	Course c = new Course();
	c.setCourseName("Java");
	c.setFees(10000);
	
	Course c1 = new Course();
	c1.setCourseName("J2EE");
	c1.setFees(15000);
	
	Course c2 = new Course();
	c2.setCourseName("SQL");
	c2.setFees(5000);
	
	Course c4 = new Course();
	c4.setCourseName("Web");
	c4.setFees(12000);
	
	et.begin();
	em.persist(c4);
	em.persist(c1);
	em.persist(c2);
	et.commit();

}
}