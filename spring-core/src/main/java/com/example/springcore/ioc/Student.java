package com.example.springcore.ioc;

import org.springframework.beans.factory.annotation.Value;

public class Student {

    @Value("S. Islam")
    private String name;
    @Value("GIS")
    private String course;
    @Value("${student.hobby}")
    private String hobby;

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Hobby: " + hobby);
    }

}
