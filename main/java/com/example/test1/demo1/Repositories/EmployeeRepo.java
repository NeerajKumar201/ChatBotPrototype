package com.example.test1.demo1.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test1.demo1.Entities.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer>{
    
}
