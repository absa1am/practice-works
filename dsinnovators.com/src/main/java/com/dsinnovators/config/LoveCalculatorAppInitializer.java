package com.dsinnovators.config;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class LoveCalculatorAppInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();

        webApplicationContext.register(LoveCalculatorAppConfig.class);

        // Create dispatcher servlet
        DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);

        // Register dispatcher servlet with servlet context
        ServletRegistration.Dynamic registeredDispatcherServlet = servletContext.addServlet("dispatcherServlet", dispatcherServlet);

        registeredDispatcherServlet.setLoadOnStartup(1);
        registeredDispatcherServlet.addMapping("/app/*");
    }

}
