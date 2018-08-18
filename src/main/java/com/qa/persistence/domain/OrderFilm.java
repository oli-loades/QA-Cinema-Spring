package com.qa.persistence.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="orderfilm")
public class OrderFilm {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	@JsonIgnore
	private long account_id;

	@ManyToOne(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "movie")
	private Movie movie;

	@OneToMany(mappedBy = "order_id", cascade=CascadeType.ALL,fetch = FetchType.EAGER, orphanRemoval = true)
	private List<OrderTicket> tickets;

	public OrderFilm() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public long getAccount() {
		return account_id;
	}

	@JsonIgnore
	public void setAccount(long account) {
		this.account_id = account;
	}

	public List<OrderTicket> getTickets() {
		return tickets;
	}

	public void setTickets(List<OrderTicket> tickets) {
		this.tickets = tickets;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}
}
