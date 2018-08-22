package com.qa.persistence.domain;

public class Seats {
	
	private int screenNumber;
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
