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
	
	private String movietitle;
	
	
	
	public Screens(int screennumber,  String movietitle) {
		super();
		this.screennumber = screennumber;
		this.movietitle = movietitle;
	}
	
	
	public int getScreennumber() {
		return screennumber;
	}
	public void setScreennumber(int screennumber) {
		this.screennumber = screennumber;
	}
	
	public String getMovietitle() {
		return movietitle;
	}
	public void setMovietitle(String movietitle) {
		this.movietitle = movietitle;
	}
	
	
	
	
}
