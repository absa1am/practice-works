package com.example.springcore.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

    @Autowired
    @Qualifier("humanHeart")
    private Heart heart;

    public void start() {
        if (heart != null) heart.pump();
        else System.out.println("Human is dead...");
    }

}
