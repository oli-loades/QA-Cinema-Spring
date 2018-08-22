package com.qa.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.qa.business.service.ScreenDateTimeService;
import com.qa.persistence.domain.ScreenDateTime;
import com.qa.persistence.domain.Seats;

@RestController
@RequestMapping(value = "/date")
@CrossOrigin(origins = "http://localhost:8080")
public class ScreenDateTimeController {
	
	@Autowired 
	ScreenDateTimeService screendateservice;
	
	@GetMapping(value="/getall")
	public 	List<ScreenDateTime> getseatNumber(){
		return screendateservice.getAllDates();
		
	}
	
	@PostMapping("/add")
	@ResponseStatus(HttpStatus.CREATED)
	public String addSeatNumber(@RequestBody ScreenDateTime screendate, @PathVariable String Time, Date date) {
		return screendateservice.addScreenDateTime(screendate, Time, date);
	}
	
	@PutMapping("/update")
	public String updateSeatNumber(@RequestBody ScreenDateTime screendate,@PathVariable String Time, Date date) {
		return screendateservice.updateTimeandDate(screendate, Time, date);
	}
	
	@DeleteMapping("/delete") 
		public String deleteSeatNumber(@RequestBody ScreenDateTime screendate, @PathVariable String Time, Date date) {
			return screendateservice.deleteDateandTime(screendate, Time, date);
		}
	
}
