package com.qa.persistence.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="Screen")
@IdClass(Screens.class)
public class Screens implements Serializable {
	
	

	@Id
	private int screennumber;
	@Id
	private String movietitle;
	
	public Screens() {}
	
	
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
