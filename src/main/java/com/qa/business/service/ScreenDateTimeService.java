package com.qa.business.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.persistence.domain.ScreenDateTime;
import com.qa.persistence.repository.ScreenDateTimeRepository;

@Service
public class ScreenDateTimeService {
	
	@Autowired
	private ScreenDateTimeRepository screendaterepo;
	
	@Autowired
	private TimeService timeservice;
	
	public List<ScreenDateTime> getAllDates() {
		return screendaterepo.findAll();
		
	}
	
	public String updateTimeandDate(ScreenDateTime screendate, String time, Date date){
		if(screendate.equals(date)) {
			screendaterepo.delete(screendate);
			screendate.setDate(date);
			String screendatetime = screendate.getScreenTime();
			screendate.setScreenTime(screendatetime);
			screendaterepo.save(screendate);
			
		} return "Booking Successfully changed";
	} 
	
	public String addScreenDateTime(ScreenDateTime screendate, String Time, Date date) {
		String screendatetime = screendate.getScreenTime();
		screendate.setScreenTime(screendatetime);
		screendate.setDate(date);
		screendaterepo.save(screendate);
		return "Date and Time added Successfully";
	}
		
	public String deleteDateandTime(ScreenDateTime screendate, String Time, Date date) {
		if (screendate.equals(date)&& screendate.equals(Time)) {
			screendaterepo.delete(screendate);
		} return"Date and Time Deleted Successfully";
	}	
	

}
