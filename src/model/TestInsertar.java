package model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import bins.Autor;

public class TestInsertar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ipartek");
		// //////////////////////////////////////////
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		// //////////////////////////////////////////////
		Autor autor2 = new Autor();
		autor2.setCodAutor(58);
		autor2.setNomAutor("Miguel de Bilbao");
		entityManager.persist(autor2);
		// ////////////////////////////////////////////
		entityTransaction.commit();
		entityManager.close();
		// //////////////////////////////////////////
		entityManagerFactory.close();
	}

}
