package mtmb;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetByCourseFee {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("uday");
		EntityManager em = emf.createEntityManager();
		
		Course c = em.find(Course.class, 1200);
		
		if(c != null) {
			System.out.println("Course Id = "+c.getCid());
			System.out.println("Course Name = "+c.getCourseName());
			System.out.println("Course fee = "+c.getFees());
			System.out.println("===================================");
			
			List<Student> students = c.getStudents();
			if(students.size()>0) {
				
				for(Student s : students) {
					System.out.println();
					System.out.println("Student Id = "+s.getSid());
					System.out.println("Student Name = "+s.getSname());
					System.out.println("Student Age = "+s.getAge());
					System.out.println("Student Phone = "+s.getPhone());
					System.out.println("-----------------------------------");
				}
				
			}else {
				System.out.println("Given Student Id Is Not Register to any Course");
			}
			
		}else {
			System.out.println("No Course In The Given Id");
		}
	}

}
