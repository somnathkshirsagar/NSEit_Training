package com.example.orderservices.orderservices.repo;

import javax.transaction.Transactional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.orderservices.orderservices.model.Orders;

@Repository
@Transactional
public interface OrdersRepo extends JpaRepository<Orders, Integer>{

}
