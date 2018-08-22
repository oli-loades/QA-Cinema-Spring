package com.qa.persistence.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="screendatetime")
@IdClass(ScreenDateTime.class)
public class ScreenDateTime implements Serializable {

	@Id
	private String screenTime;
	@Id
	private Date date;

	public ScreenDateTime(String screenTime, Date date) {
		super();
		this.screenTime = screenTime;
		this.date = date;
	}

	public String getScreenTime() {
		return screenTime;
	}

	public void setScreenTime(String screenTime) {
		this.screenTime = screenTime;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
