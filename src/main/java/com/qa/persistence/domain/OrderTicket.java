package com.qa.persistence.domain;

import javax.persistence.*;

@Entity
@Table(name = "orderticket")
public class OrderTicket {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private long id;

	@ManyToOne
	@JoinColumn(name = "ticket")
	private Ticket ticket;

	@Column(name = "order")
	private long order;

	private int quantity;

	public OrderTicket() {

	}

	public OrderTicket(int quantity) {
		this.quantity = quantity;
	}

	public long getOrderTicketId() {
		return id;
	}

	public void setOrderTicketId(long id) {
		this.id = id;
	}

	public int getNumberoftickets() {
		return quantity;
	}

	public void setNumberoftickets(int quantity) {
		this.quantity = quantity;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public long getOrderticket() {
		return order;
	}

	public void setOrderticket(long order) {
		this.order = order;
	}

}
