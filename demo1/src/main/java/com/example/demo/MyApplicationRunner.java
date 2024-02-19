package com.example.demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationRunner implements ApplicationRunner, Ordered {

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("Database has been creating...");
    }

    @Override
    public int getOrder() {
        return 1;
    }

}
