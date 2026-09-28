//package com.org.paymentservice.common.config;
//
//import jakarta.servlet.ServletContext;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.ServletRegistration;
//import org.h2.server.web.JakartaWebServlet;
//import org.springframework.boot.web.servlet.ServletContextInitializer;
//import org.springframework.context.annotation.Configuration;
//
//
//@Configuration
//public class H2ConsoleConfig implements ServletContextInitializer {
//
//    @Override
//    public void onStartup(ServletContext servletContext) throws ServletException {
//        // Direct container-level mapping bypassing Spring Gateway Filter wrappers
//        JakartaWebServlet h2Servlet = new JakartaWebServlet();
//        ServletRegistration.Dynamic registration = servletContext.addServlet("h2-console", h2Servlet);
//
//        registration.setLoadOnStartup(1);
//        registration.addMapping("/h2-console/*");
//    }
//}
