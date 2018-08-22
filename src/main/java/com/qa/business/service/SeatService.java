package com.qa.business.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.persistence.domain.Seats;
import com.qa.persistence.repository.SeatRepository;

@Service
public class SeatService {
	
	@Autowired
	private SeatRepository seatsRepo;
	
	@Autowired
	private ScreenServices srcservice;
	
	public List<Seats> getAllseats() {
		return seatsRepo.findAll();
	}
	
	public String updateSeatNumber(Seats seats,String seatNumber) {
		if(seats.equals(seatNumber)) {
		seatsRepo.delete(seats);
		seats.setSeatNumber(seatNumber);
		seatsRepo.save(seats);}
		return "Seat successfully changed";
	}
	
	
	public String addSeatNumber(Seats seats, String movietitle, String seatNumber) {
		int screen = srcservice.getScreenNumber(movietitle);
		seats.setScreenNumbers(screen);
		if(seats.equals(seatNumber) && seats.equals(screen)) {
			return"Seat not Available";
			
		}else {
			seats.setSeatNumber(seatNumber);
			seatsRepo.save(seats);
			return "Seat Available";
			
		}
		
	}

	public String deleteSeatNumber(Seats seats, String seatNumber) {
		if(seats.equals(seatNumber)) {
		seatsRepo.delete(seats);}
		return"Seats deleted Successfully";
		
	}

}
