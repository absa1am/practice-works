package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class MyCommandLineRunner implements CommandLineRunner, Ordered {

    @Override
    public void run(String... args) {
        System.out.println("Database table has been created.");
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
