package com.qa.persistence.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.qa.persistence.domain.OrderTicket;

@Entity
@Table(name="orderfilm")
public class OrderFilm {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name="account")
	private long account;
	
	@OneToOne
	@JoinColumn(name = "movie")
	private Movie movie;

	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<OrderTicket> tickets;

	public OrderFilm() {

	}

	public OrderFilm(long account) {
		this.account = account;
		tickets = new ArrayList<>();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public long getAccount() {
		return account;
	}

	public void setAccount(long account) {
		this.account = account;
	}

	public List<OrderTicket> getTickets() {
		return tickets;
	}

	public void setTickets(List<OrderTicket> tickets) {
		this.tickets = tickets;
	}

}
