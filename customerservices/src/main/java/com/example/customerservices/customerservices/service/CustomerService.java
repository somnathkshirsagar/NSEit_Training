package com.example.customerservices.customerservices.service;

import java.util.List;

import com.example.customerservices.customerservices.model.Customer;

public interface CustomerService {
	
	public List<Customer> displayAll(); //Read
	public String insertCustomer(Customer customer); //Create  //Update
	public String deleteCustomer(int cid);  //Delete
}
