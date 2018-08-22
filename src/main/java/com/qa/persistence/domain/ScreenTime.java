package com.qa.persistence.domain;

import java.io.Serializable;
import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;


@Entity
@Table(name="time")
@IdClass(ScreenTime.class)
public class ScreenTime implements Serializable {
   
	@Id
    private String screentimes;
    

	public ScreenTime(String screentimes) {
		super();

		this.screentimes = screentimes;
	}

   


}
