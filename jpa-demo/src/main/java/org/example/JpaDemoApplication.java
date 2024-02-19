package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.example.entities.*;

public class JpaDemoApplication {

    public static void main(String[] args) {
        /*
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jakarta-persistence");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        Staff staff = new Staff("Abdus Salam");
        Staff staff1 = new Staff("Ashik Mahmud");

        TeachingStaff teachingStaff = new TeachingStaff("Gopal","MSc MEd","Maths");
        TeachingStaff teachingStaff1 = new TeachingStaff("Manisha", "BSc BEd", "English");

        NonTeachingStaff nonTeachingStaff = new NonTeachingStaff("Satish", "Accounts");
        NonTeachingStaff nonTeachingStaff1 = new NonTeachingStaff("Krishna", "Office Admin");

        entityTransaction.begin();
        entityManager.persist(staff);
        entityManager.persist(staff1);
        entityManager.persist(teachingStaff);
        entityManager.persist(teachingStaff1);
        entityManager.persist(nonTeachingStaff);
        entityManager.persist(nonTeachingStaff1);

        entityTransaction.commit();
        entityManager.close();
        entityManagerFactory.close();

        System.out.println("Table added successfully...");
        */

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jakarta-persistence");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        Student student = entityManager.find(Student.class, 2);
//        Department department = entityManager.find(Department.class, 2);

        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();

        System.out.println(student);

        entityManager.close();
        entityManagerFactory.close();
    }

}
