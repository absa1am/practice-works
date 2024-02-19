package com.example.springcore.college;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ScienceTeacher implements Teacher {

    @Override
    public void teach() {
        System.out.println("I'm your fucking science teacher, man");
    }

}
