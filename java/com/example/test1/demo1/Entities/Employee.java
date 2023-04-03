package com.example.test1.demo1.Entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;;

@Entity
@Table
public class Employee {

    @Id
    private Integer EmpID;

    private String EmpName;
    private Boolean CabUse;
    private Integer CabId;
    public Employee(Integer empID, String empName, Boolean cabUse, Integer cabId) {
        EmpID = empID;
        EmpName = empName;
        CabUse = cabUse;
        CabId = cabId;
    }

    public Employee() {
    }

    public Integer getEmpID() {
        return EmpID;
    }

    public void setEmpID(Integer empID) {
        EmpID = empID;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public Boolean getCabUse() {
        return CabUse;
    }

    public void setCabUse(Boolean cabUse) {
        CabUse = cabUse;
    }

    public Integer getCabId() {
        return CabId;
    }

    public void setCabId(Integer cabId) {
        CabId = cabId;
    }

    
  

}
