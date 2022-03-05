package com.example.customerservices.customerservices.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.customerservices.customerservices.model.Customer;

@Repository
@Transactional
public interface CustomerRepo extends  JpaRepository<Customer, Integer>{
	

}
