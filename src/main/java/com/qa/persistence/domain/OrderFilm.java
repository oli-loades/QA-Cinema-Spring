package com.qa.persistence.domain;

import java.util.List;

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

	@OneToMany(mappedBy = "order_id", cascade=CascadeType.ALL,fetch = FetchType.EAGER, orphanRemoval = false)
	private List<OrderTicket> tickets;

	public OrderFilm() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(long account_id) {
		this.account_id = account_id;
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
