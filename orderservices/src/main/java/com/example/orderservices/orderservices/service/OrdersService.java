package com.example.orderservices.orderservices.service;
import com.example.orderservices.orderservices.model.Orders;
import java.util.List;

public interface OrdersService {
	
	public List<Orders> displayAll(); //Read
	public String insertOrder(Orders order); //Create  //Update
	public String deleteOrder(int oid);  //Delete
	

}
