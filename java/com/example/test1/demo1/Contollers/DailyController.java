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

import com.example.test1.demo1.Entities.Daily;
import com.example.test1.demo1.Repositories.DailyRepo;

@RestController
public class DailyController {
    @Autowired
    DailyRepo dailyrepo;

    @GetMapping("/api/getdailydata")
    public ResponseEntity<List<Daily>> getDailyData(){
        return new ResponseEntity<>(dailyrepo.findAll(),HttpStatus.OK);
    }

    @PostMapping("/api/putdailydata")
    public ResponseEntity<Daily> putDailyData(Daily daily){
        if(daily.getCabid()==null || daily.getEmpid()==null || daily.getCtoffice()==null){
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
        if(dailyrepo.validateemp(daily.getEmpid())==1 && dailyrepo.validatecab(daily.getCabid())==1){
            
            if( dailyrepo.find1(daily.getEmpid(),daily.getDate()).size() == 0){
                return new ResponseEntity<>(dailyrepo.save(daily),HttpStatus.OK);
            }
            else{
                return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
    }

    @DeleteMapping("/api/deletedailydata/{id}")
    public ResponseEntity<String> deleteDailyData(@PathVariable Long id){
        dailyrepo.deleteById(id);
        return new ResponseEntity<>("Deletion Successful",HttpStatus.OK);
    }

}
