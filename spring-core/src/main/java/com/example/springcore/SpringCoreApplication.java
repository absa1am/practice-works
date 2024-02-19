package com.example.springcore;

import com.example.springcore.college.College;
import com.example.springcore.ioc.Human;
import com.example.springcore.ioc.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringCoreApplication.class, args);

//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

//		Human human = context.getBean("human", Human.class);
//
//		human.start();

//		Student student = context.getBean("student", Student.class);
//
//		student.displayInfo();

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.example");

		College college = context.getBean("college", College.class);

		college.test();

		context.close();
	}

}
