package com.example.orderservices.orderservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.orderservices.orderservices.model.Orders;
import com.example.orderservices.orderservices.repo.OrdersRepo;

@Service
public class OrderServiceImpl implements OrdersService {
	
	@Autowired
	OrdersRepo repo;

	@Override
	public List<Orders> displayAll() {
		return repo.findAll();
	}

	@Override
	public String insertOrder(Orders order) {
	     repo.save(order);
		return "Order Added";
	}

	@Override
	public String deleteOrder(int oid) {
		repo.deleteById(oid);
		return "Order Deleted";
	}

}
