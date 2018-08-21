package com.qa.persistence.domain;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Screens {
	
	
	
	@ManyToOne(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "movie")
	private Movie movie;
	
	private int screennumber;
	
	String movieID;
	
	private String movietitle;
	
	
	public Screens(int screennumber, String movieID, String movietitle) {
		super();
		this.screennumber = screennumber;
		this.movieID = movieID;
		this.movietitle = movietitle;
	}
	
	
	public int getScreennumber() {
		return screennumber;
	}
	public void setScreennumber(int screennumber) {
		this.screennumber = screennumber;
	}
	public String getMovieID() {
		return movieID;
	}
	public void setMovieID(String movieID) {
		this.movieID = movieID;
	}
	public String getMovietitle() {
		return movietitle;
	}
	public void setMovietitle(String movietitle) {
		this.movietitle = movietitle;
	}
	
	
	
	
}
