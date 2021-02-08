package com.qa.persistence.domain;

import java.util.List;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	private Set<OrderTicket> tickets;

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

	public Set<OrderTicket> getTickets() {
		return tickets;
	}

	public void setTickets(Set<OrderTicket> tickets) {
		this.tickets = tickets;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}
}
