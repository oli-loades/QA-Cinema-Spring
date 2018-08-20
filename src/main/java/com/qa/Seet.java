package com.qa;

import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;

@Entity
@Table
public class Seet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long seatNumber;

	@Column(name="avaible")
	private boolean seatAvaible =true;


	public Long getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(Long seatNumber) {
		this.seatNumber = seatNumber;
	}

	public boolean isSeatAvaible() {
		return seatAvaible;
	}

	public void setSeatAvaible(boolean seatAvaible) {
		this.seatAvaible = seatAvaible;
	}
}
