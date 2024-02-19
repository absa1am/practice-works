package com.example.springcore.college;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher {

    @Override
    public void teach() {
        System.out.println("I'm your fucking math teacher, man");
    }

}
