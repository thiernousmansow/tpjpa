package fr.istic.tpjpa.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import fr.istic.tpjpa.domain.Device;
import fr.istic.tpjpa.domain.ElectronicDevice;
import fr.istic.tpjpa.domain.Heater;
import fr.istic.tpjpa.domain.Home;
import fr.istic.tpjpa.domain.Person;

public class JpaTest {

	private EntityManager manager;

	public JpaTest(EntityManager manager) {
		this.manager = manager;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("example");
		EntityManager manager = factory.createEntityManager();
		JpaTest test = new JpaTest(manager);

		EntityTransaction tx = manager.getTransaction();
		tx.begin();
    
		// TODO create entity
		// entity home
         Home maison1=new Home();
         Home maison2=new Home();
         Home maison3=new Home();
         
     	//entity person
         Person pers1=new Person();
         Person pers2=new Person();
         Person pers3=new Person();
         

		tx.commit();
	
		 manager.persist(maison1);
		 manager.persist(maison2);
		 manager.persist(maison3);
		 
		 manager.persist(pers1);
		 manager.persist(pers2);
		 manager.persist(pers3);
	
	}
}
