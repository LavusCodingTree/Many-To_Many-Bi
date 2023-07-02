package mtmb;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertStudent {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("uday");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Student s1 = new Student();
		s1.setSname("Kavana");
		s1.setAge(21);
		s1.setPhone(66665999);

		Course c1 = em.find(Course.class, 1);
		Course c2 = em.find(Course.class, 2);
		Course c3 = em.find(Course.class, 3);

		List<Course> courses = new ArrayList<Course>();
		courses.add(c1);
		courses.add(c2);
		courses.add(c3);

		s1.setCourses(courses);

		et.begin();
		em.persist(s1);
		et.commit();

	}

}
