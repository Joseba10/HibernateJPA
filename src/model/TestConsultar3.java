package model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import bins.Libro;

public class TestConsultar3 {

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
		// Buscar un registro
		Libro libro = entityManager.find(Libro.class, "1111111111113");
		System.out.println("id= " + libro.getIsbn() + " - nombre autor= " + libro.getAutor());
		// ////////////////////////////////////////////
		entityTransaction.commit();
		entityManager.close();
		// //////////////////////////////////////////
	}

}
