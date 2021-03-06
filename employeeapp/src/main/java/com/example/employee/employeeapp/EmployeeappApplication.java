package com.example.employee.employeeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.employee.employeeapp")
public class EmployeeappApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeappApplication.class, args);
	}

}
