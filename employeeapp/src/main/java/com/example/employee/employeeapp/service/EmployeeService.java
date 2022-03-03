package com.example.employee.employeeapp.service;

import java.util.List;

import com.example.employee.employeeapp.model.Employee;

public interface EmployeeService {
	
	public List<Employee> getAllEmps();
	public void insertEmp(Employee employee);
	public void deleteEmp(int id);
	public void updateEmp(Employee employee);


}