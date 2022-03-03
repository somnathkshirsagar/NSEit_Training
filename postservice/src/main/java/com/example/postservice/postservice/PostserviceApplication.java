package com.example.postservice.postservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.postservice.postservice")
public class PostserviceApplication {
    
	public static void main(String[] args) {
		SpringApplication.run(PostserviceApplication.class, args);
	}

}
