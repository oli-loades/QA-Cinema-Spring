package com.qa.util;

public class OrderTicketDto {
private long order;
private long ticket;
private int quantity;

public OrderTicketDto() {
	
}

public long getOrder() {
	return order;
}

public void setOrder(long order) {
	this.order = order;
}

public long getTicket() {
	return ticket;
}

public void setTicket(long ticket) {
	this.ticket = ticket;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}


}
