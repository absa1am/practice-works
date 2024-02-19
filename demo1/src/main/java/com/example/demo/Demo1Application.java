package com.example.demo;

import org.springframework.boot.Banner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.metrics.buffering.BufferingApplicationStartup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;
import java.util.Set;

@RestController
@SpringBootApplication
public class Demo1Application {

    @RequestMapping("/")
    public String home() {
        return "Welcome to Spring Boot";
    }

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Demo1Application.class);

        app.setBannerMode(Banner.Mode.OFF);
        app.setApplicationStartup(new BufferingApplicationStartup(2048));
        app.run(args);
    }

}
