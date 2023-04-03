package com.example.test1.demo1.Contollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test1.demo1.Entities.Employee;
import com.example.test1.demo1.Repositories.EmployeeRepo;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeRepo emprepo;

    @GetMapping("/api/getempdata")
    public ResponseEntity<List<Employee>> getEmpData(){
        return new ResponseEntity<>(emprepo.findAll(),HttpStatus.OK);
    }

    @PostMapping("/api/putempdata")
    public ResponseEntity<Employee> putEmpData(Employee emp){
        if(emprepo.find1(emp.getEmpID()) == null){
            return new ResponseEntity<Employee>(emprepo.save(emp),HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
    }

    @DeleteMapping("/api/deleteempdata/{id}")
    public void deleteempdata(@PathVariable Integer id){
        emprepo.deleteById(id);
    }
}
