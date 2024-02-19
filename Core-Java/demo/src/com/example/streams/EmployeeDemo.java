package com.example.streams;

import java.util.stream.Stream;

public class EmployeeDemo {

    private static Employee[] arrayOfEmployees = {
        new Employee(1, "Abdus Salam", 10000),
        new Employee(2, "Susmoy Karmaker", 100000),
        new Employee(3, "Ashik Mahmud", 30000)
    };

    public static void main(String[] args) {
        Stream<Employee> employees = Stream.of(arrayOfEmployees);

        
    }

}
