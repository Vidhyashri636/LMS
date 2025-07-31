package com.lms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import jakarta.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
@EnableJpaAuditing
@EntityScan(basePackages = "com.lms.model")
@EnableJpaRepositories(basePackages = "com.lms.repository")
public class LibraryManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibraryManagementSystemApplication.class, args);
    }

    @PostConstruct
    public void init() {
        // Set default timezone to UTC
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        
        // Application startup logs
        System.out.println("===========================================");
        System.out.println("Library Management System is now running!");
        System.out.println("===========================================");
        System.out.println("Server Configuration:");
        System.out.println("- Port: 8080");
        System.out.println("- Context Path: /api");
        System.out.println("- Access URL: http://localhost:8080/api");
        System.out.println("===========================================");
    }
}
