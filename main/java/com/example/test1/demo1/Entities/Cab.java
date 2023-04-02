package com.example.test1.demo1.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Cab {
    @Id
    private Integer cabid;

    private String start;
    private String via;
    private String end;
    public Cab(Integer cabid, String start, String via, String end) {
        this.cabid = cabid;
        this.start = start;
        this.via = via;
        this.end = end;
    }
    public Cab() {
    }
    public Integer getCabid() {
        return cabid;
    }
    public void setCabid(Integer cabid) {
        this.cabid = cabid;
    }
    public String getStart() {
        return start;
    }
    public void setStart(String start) {
        this.start = start;
    }
    public String getVia() {
        return via;
    }
    public void setVia(String via) {
        this.via = via;
    }
    public String getEnd() {
        return end;
    }
    public void setEnd(String end) {
        this.end = end;
    }

   
    
}
