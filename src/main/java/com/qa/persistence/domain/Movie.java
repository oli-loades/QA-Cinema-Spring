package com.qa.persistence.domain;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "movie")
public class Movie {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private long id;
	
	@Column (name = "title")
	private String title;
	
	@Column (name = "imdbid")
	private String imdbID;

	public Movie() {

	}

	public Movie(String title, String imdbID) {
		this.title = title;
		this.imdbID = imdbID;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String Title) {
		this.title = Title;
	}

	public String getImdbID() {
		return imdbID;
	}

	public void setImdbID(String imdbID) {
		this.imdbID = imdbID;
	}
}
