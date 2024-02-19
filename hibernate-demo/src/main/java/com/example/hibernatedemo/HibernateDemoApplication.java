package com.example.hibernatedemo;

import com.example.hibernatedemo.models.Book;
import com.example.hibernatedemo.models.NonTeachingStaff;
import com.example.hibernatedemo.models.TeachingStaff;
import jakarta.persistence.*;

import java.util.List;

public class HibernateDemoApplication {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("p-unit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();

		TeachingStaff ts1 = new TeachingStaff(1,"Gopal","MSc MEd","Maths");
		TeachingStaff ts2 = new TeachingStaff(2, "Manisha", "BSc BEd", "English");

		NonTeachingStaff nts1 = new NonTeachingStaff(3, "Satish", "Accounts");
		NonTeachingStaff nts2 = new NonTeachingStaff(4, "Krishna", "Office Admin");

//		entityManager.persist(ts1);

		entityTransaction.commit();
	}

}
