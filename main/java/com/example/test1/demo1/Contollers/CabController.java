package com.example.test1.demo1.Contollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.test1.demo1.Entities.Cab;
import com.example.test1.demo1.Repositories.CabRepo;

@RestController
public class CabController {
    @Autowired
    CabRepo cabrepo;

    @GetMapping("/api/getcabdata")
    public ResponseEntity<List<Cab>> getDailyData(){
        return new ResponseEntity<>(cabrepo.findAll(),HttpStatus.OK);
    }

    @PostMapping("/api/putcabdata")
    public ResponseEntity<Cab> putDailyData(@RequestBody Cab cab){
        return new ResponseEntity<Cab>(cabrepo.save(cab),HttpStatus.CREATED);
    }

    @DeleteMapping("/api/deletecabdata/{id}")
    public ResponseEntity<String> deleteDailyData(@PathVariable Integer id){
        cabrepo.deleteById(id);
        return new ResponseEntity<>("Deletion Successful",HttpStatus.OK);
    }


}
