package com.example.customerservices.customerservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.customerservices.customerservices.model.Customer;
import com.example.customerservices.customerservices.repo.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepo repo;

	@Override
	public List<Customer> displayAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public String insertCustomer(Customer customer) {
		repo.save(customer);
		return "Customer Data Inserted";
	}

	@Override
	public String deleteCustomer(int cid) {
		repo.deleteById(cid);
		return "Customer Data Deleted";
	}
	
	

}
