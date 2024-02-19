package com.example.springcore.configurations;

import com.example.springcore.college.College;
import com.example.springcore.college.MathTeacher;
import com.example.springcore.college.Principal;
import com.example.springcore.college.Teacher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.example" })
public class SpringCoreAppConfig {

//    @Bean
//    public Teacher mathTeacher() {
//        return new MathTeacher();
//    }
//
//    @Bean
//    public Principal principalBean() {
//        return new Principal();
//    }
//
//    @Bean(name = { "college", "collegeBean" })
//    public College collegeBean() {
//        College college = new College();
//
//        college.setPrincipal(principalBean());
//        college.setTeacher(mathTeacher());
//
//        return college;
//    }

}
