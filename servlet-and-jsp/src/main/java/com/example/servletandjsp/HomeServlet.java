package com.example.servletandjsp;

import com.example.servletandjsp.entities.Employee;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@WebServlet(name = "HomeServlet", value = { "/home" })
public class HomeServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        Configuration configuration = new Configuration();

        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Employee.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Employee employee = new Employee();

        employee.setName("Susmoy Karmaker");
        employee.setEmail("susmoy.mbstu@gmail.com");

        Transaction transaction = session.beginTransaction();

        session.save(employee);

        transaction.commit();

        System.out.println("Inserting data into employee table...");
    }

}
