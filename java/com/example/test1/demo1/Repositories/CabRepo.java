package com.example.test1.demo1.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.test1.demo1.Entities.Cab;

public interface CabRepo extends JpaRepository<Cab,Integer>{
    @Query(nativeQuery = true, value = "select * from cab where cabid = :cabid1")
    public Integer find1(Integer cabid1);
}
