package com.qa.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.qa.persistence.domain.movieTime;
import  com.qa.business.service.timeServie;

import java.util.List;

@RestController
@RequestMapping(value ="/time")
@CrossOrigin(origins = "http://localhost:8080")
public class timeController {

    timeServie timeServie;

    @GetMapping("/getAllTimes")
    public List<movieTime> getFlimTimes(){
         return timeServie.getTimes();
    }
}
