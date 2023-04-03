package com.example.test1.demo1.Repositories;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.test1.demo1.Entities.Daily;

public interface DailyRepo extends JpaRepository<Daily,Long>{

    @Query(nativeQuery = true, value = "select * from daily where empid = :empid1 and date = :date1")
    public List<Daily> find1(Integer empid1, Date date1);

    @Query(nativeQuery = true,value = "select count(empid) from employee where empid = :empid1")
    public Integer validateemp(Integer empid1);

    @Query(nativeQuery = true,value = "select count(cab) from employee where cabid = :cabid1")
    public Integer validatecab(Integer cabid1);
}
