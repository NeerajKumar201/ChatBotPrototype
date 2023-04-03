package com.example.test1.demo1.Entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Daily {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;

    @GeneratedValue
    private Date date = new Date(System.currentTimeMillis());
    
    private Boolean ctoffice;
    private Integer cabid;
    private Integer empid;

    public Daily() {
    }

    public Daily(Long id, Date date, Boolean ctoffice, Integer cabid, Integer empid) {
        Id = id;
        this.date = date;
        this.ctoffice = ctoffice;
        this.cabid = cabid;
        this.empid = empid;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getCtoffice() {
        return ctoffice;
    }

    public void setCtoffice(Boolean ctoffice) {
        this.ctoffice = ctoffice;
    }

    public Integer getCabid() {
        return cabid;
    }

    public void setCabid(Integer cabid) {
        this.cabid = cabid;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }
   
    
}
