package com.example.springcore.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:college.properties")
public class College {

    @Value("${college.name}")
    private String name;
    @Autowired
    private Principal principal;
    private Teacher teacher;

//    public College(Principal principal) {
//        this.principal = principal;
//
//        System.out.println("College() is being called...");
//    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    @Autowired
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void test() {
        System.out.println("From: " + name);
        principal.principalInfo();
        teacher.teach();
        System.out.println("Testing method is being called...");
    }

}
