package com.qa.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.persistence.domain.ScreenTime;
import com.qa.persistence.repository.ScreenTimeRespository;

import  java.util.List;


@Service
public class TimeService {
    @Autowired
    ScreenTimeRespository timeResponsity;

    public List<ScreenTime> getTimes() {
    	return timeResponsity.findAll();}
    

}
