package com.qa.persistence.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyIntializer","handler"})
public class OrderTicket {
	

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderTicketId;
    
   
    
    @ManyToOne
    @JoinColumn(name="ticketID")
    private Ticket ticket;
    
    @ManyToOne
    @JoinColumn(name="orderId")
    private OrderFilm order;
    
    private int numberoftickets;

	public OrderTicket(int numberoftickets) {
		this.numberoftickets = numberoftickets;
	}

	

	public long getOrderTicketId() {
		return orderTicketId;
	}



	public void setOrderTicketId(long orderTicketId) {
		this.orderTicketId = orderTicketId;
	}



	public int getNumberoftickets() {
		return numberoftickets;
	}

	public void setNumberoftickets(int numberoftickets) {
		this.numberoftickets = numberoftickets;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public OrderFilm getOrderticket() {
		return order;
	}

	public void setOrderticket(OrderFilm order) {
		this.order = order;
	}
    
    
    


}
