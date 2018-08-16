package com.qa.persistence.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.qa.persistence.domain.OrderTicket;

@Entity
@JsonIgnoreProperties({ "hibernatateLazztIntializer", "handler" })
public class OrderFilm {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderid;

	@OneToOne
	@JoinColumn(name = "accountId")
	@JsonIgnore
	private Account account;
	
	@OneToOne
	@JoinColumn(name = "movieId")
	@JsonIgnore
	private Movie movie;

	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<OrderTicket> tickets;

	public OrderFilm() {

	}

	public OrderFilm(Account account) {
		this.account = account;
		tickets = new ArrayList<>();
	}

	public Long getId() {
		return orderid;
	}

	public void setId(Long id) {
		this.orderid = id;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public List<OrderTicket> getTickets() {
		return tickets;
	}

	public void setTickets(List<OrderTicket> tickets) {
		this.tickets = tickets;
	}

}
