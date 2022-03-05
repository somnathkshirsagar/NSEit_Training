package com.example.customerservices.customerservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.customerservices.customerservices")
public class CustomerservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerservicesApplication.class, args);
	}

}
