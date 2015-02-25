@@ -0,0 +1,57 @@
package fr.istic.tpjpa.jpa;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import fr.istic.tpjpa.domain.Home;
import fr.istic.tpjpa.domain.Person;

public class N1Select {

	private EntityManager manager;

	public N1Select(EntityManager manager) {
		this.manager = manager;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("example");
		EntityManager manager = factory.createEntityManager();
		N1Select test = new N1Select(manager);

		
		TypedQuery<Person> q = test.manager.createQuery("select p from Person p",Person.class);
		long start = System.currentTimeMillis();
		List<Person> res = q.getResultList();
		
		
		for (Person p : res){
			for (Home h : p.getHomes()){
				h.getSuperficie();
			}
		}

		long end = System.currentTimeMillis();
		long duree = end - start;
		System.err.println("temps d'exec = " +  duree);

		// TODO persist entity


		// TODO run request

		System.out.println(".. done");
	}

}