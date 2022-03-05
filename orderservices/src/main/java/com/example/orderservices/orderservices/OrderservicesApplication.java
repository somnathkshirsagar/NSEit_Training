package com.example.orderservices.orderservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.orderservices.orderservices")
public class OrderservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderservicesApplication.class, args);
	}

}
