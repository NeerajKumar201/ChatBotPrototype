package com.example.test1.demo1.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.test1.demo1.Entities.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer>{
    @Query(nativeQuery = true, value = "select * from employee where empid = :empid1")
    public Integer find1(Integer empid1);
}
