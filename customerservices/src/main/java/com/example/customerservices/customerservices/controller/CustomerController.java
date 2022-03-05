package com.example.customerservices.customerservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.customerservices.customerservices.model.Customer;
import com.example.customerservices.customerservices.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerService service;
	
	@GetMapping("/all")
	public List<Customer> showAll(){
		return service.displayAll();
	}
	
	@PostMapping("/add")
	public String addCustomer(@RequestBody Customer customer) {
		return service.insertCustomer(customer);
	}
	
	@DeleteMapping("/delete/{cid}")
	public String deleteCustomer(@PathVariable("cid") int cid) {
		return service.deleteCustomer(cid);
	}

}