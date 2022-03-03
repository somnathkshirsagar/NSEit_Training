package com.example.employee.employeeapp.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employee.employeeapp.model.Employee;

@Repository
@Transactional
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

}