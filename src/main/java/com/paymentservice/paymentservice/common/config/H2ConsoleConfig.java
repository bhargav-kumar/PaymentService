package com.paymentservice.paymentservice.common.config;

import org.h2.server.web.WebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class H2ConsoleConfig {

    @Bean
    public ServletRegistrationBean<WebServlet> h2ConsoleServletRegistration() {
        // Explicitly registers H2's dashboard servlet to Tomcat's web context
        // ensuring it bypasses any Spring Cloud Gateway middleware blockers
        ServletRegistrationBean<WebServlet> registration = new ServletRegistrationBean<>(new WebServlet());
        registration.addUrlMappings("/h2-console/*");
        return registration;
    }
}
