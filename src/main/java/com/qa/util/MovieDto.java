package com.qa.util;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MovieDto {
	
	private long id;
	@JsonProperty(value = "Title")
	private String title;
	@JsonProperty(value = "Year")
	private int year;
	@JsonProperty(value = "Released")
	private String released;
	@JsonProperty(value = "Rated")
	private String rated;
	@JsonProperty(value = "Runtime")
	private String runtime;
	@JsonProperty(value = "Genre")
	private String genre;
	private String imdbID;
	@JsonProperty(value = "Poster")
	private String posterURL;
	@JsonProperty(value = "Plot")
	private String plot;
	
	public MovieDto() {
		
	}
	
	public MovieDto(String title,String release, String rated, String runtime, String genre,String imdbID,String poster,String plot,int year) {
		this.title = title;
		this.released = release;
		this.rated = rated;
		this.runtime = runtime;
		this.genre = genre;
		this.imdbID = imdbID;
		this.year = year;
		this.posterURL = poster;
		this.plot = plot;
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
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getReleased() {
		return released;
	}
	public void setReleased(String release) {
		this.released = release;
	}
	public String getRated() {
		return rated;
	}
	public void setRated(String rated) {
		this.rated = rated;
	}
	public String getRuntime() {
		return runtime;
	}
	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getImdbID() {
		return imdbID;
	}
	public void setImdbID(String imdbID) {
		this.imdbID = imdbID;
	}

	public String getPlot() {
		return plot;
	}

	public void setPlot(String plot) {
		this.plot = plot;
	}

	public String getPosterURL() {
		return posterURL;
	}

	public void setPosterURL(String posterURL) {
		this.posterURL = posterURL;
	}
}
