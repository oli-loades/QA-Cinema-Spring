package com.qa.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.qa.persistence.domain.ScreenTime;
import  com.qa.business.service.TimeService;

import java.util.List;

@RestController
@RequestMapping(value ="/time")
@CrossOrigin(origins = "http://localhost:8080")
public class TimeController {

    TimeService timeServie;

    @GetMapping("/getAllTimes")
    public List<ScreenTime> getFlimTimes(){
         return timeServie.getTimes();
    }
}
