package com.example.test1.demo1.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test1.demo1.Entities.Cab;

public interface CabRepo extends JpaRepository<Cab,Integer>{
    
}
