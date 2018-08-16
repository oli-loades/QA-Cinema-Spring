package com.qa.persistence.domain;

import javax.persistence.*;

@Entity
@Table(name = "orderticket")
public class OrderTicket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@ManyToOne
	@JoinColumn(name = "ticket")
	private Ticket ticket;

	@Column(name = "order")
	private long order;

	private int quantity;

	public OrderTicket() {

	}

	public OrderTicket(int numberoftickets) {
		this.quantity = numberoftickets;
	}

	public long getOrderTicketId() {
		return id;
	}

	public void setOrderTicketId(long orderTicketId) {
		this.id = orderTicketId;
	}

	public int getNumberoftickets() {
		return quantity;
	}

	public void setNumberoftickets(int numberoftickets) {
		this.quantity = numberoftickets;
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
