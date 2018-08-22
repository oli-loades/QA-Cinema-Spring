package com.qa.persistence.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="seat")
@IdClass(Seats.class)
public class Seats implements Serializable{
	
	@Id
	private int screenNumber;
	@Id
	private String seatNumber;
	
	public Seats() {}
	
	public Seats(int screenNumber, String seatNumber) {
		super();
		this.screenNumber = screenNumber;
		this.seatNumber = seatNumber;
	}
	public int getScreenNumbers() {
		return screenNumber;
	}
	public void setScreenNumbers(int screenNumber) {
		this.screenNumber = screenNumber;
	}
	public String getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}
	
	
	

}
