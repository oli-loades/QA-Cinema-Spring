package com.qa.controller;



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

import com.qa.business.service.SeatService;
import com.qa.persistence.domain.Seats;


@RestController
@RequestMapping(value = "/seat")
@CrossOrigin(origins = "http://localhost:8080")
public class SeatController {
	
	@Autowired
	SeatService seatservices;
	
	@GetMapping(value="/getall")
	public 	List<Seats> getseatNumber(){
		return seatservices.getAllseats();
		
	}
	
	@PostMapping("/add")
	@ResponseStatus(HttpStatus.CREATED)
	public String addSeatNumber(@RequestBody Seats seats, @PathVariable String movietitle, String seatNumber) {
		return seatservices.addSeatNumber(seats, movietitle,seatNumber );
	}
	
	@PutMapping("/update")
	public String updateSeatNumber(@RequestBody Seats seats,@PathVariable String seatNumber) {
		return seatservices.updateSeatNumber(seats, seatNumber);
	}
	
	@DeleteMapping("/delete") 
		public String deleteSeatNumber(@RequestBody Seats seats, @PathVariable String seatNumber) {
			return seatservices.deleteSeatNumber(seats, seatNumber);
		}
	

}
