package com.qa.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qa.persistence.repository.timeResponsity;
import com.qa.persistence.domain.movieTime;
import  java.util.List;

import java.sql.Time;

@Service
public class timeServie {
    @Autowired
    timeResponsity timeResponsity;

    public List<movieTime> getTimes() {


        return timeResponsity.findAll();

    }

}
