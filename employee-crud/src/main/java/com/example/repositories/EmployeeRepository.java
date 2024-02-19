package com.example.repositories;

import com.example.entities.Employee;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeRepository implements Repository<Employee, Integer> {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Employee> findAll() {
        return null;
    }

    @Override
    public Employee findById(Integer i) {
        return null;
    }

    @Override
    public void save(Employee employee) {

    }

    @Override
    public void delete(Employee employee) {

    }

}
