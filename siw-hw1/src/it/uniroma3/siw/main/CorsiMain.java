package it.uniroma3.siw.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CorsiMain {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("corsi-unit");
		EntityManager em = emf.createEntityManager();
		

		EntityTransaction tx = em.getTransaction();
		tx.begin();
		//em.persist();
		tx.commit();

		em.close();
		emf.close();
	}
}

		
