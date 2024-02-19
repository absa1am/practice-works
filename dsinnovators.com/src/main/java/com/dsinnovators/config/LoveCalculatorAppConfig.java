package com.dsinnovators.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = { "com.dsinnovators" })
public class LoveCalculatorAppConfig {

    // Setting up view resolver
    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();

        viewResolver.setPrefix("/views/");
        viewResolver.setSuffix(".jsp");

        return viewResolver;
    }

}
