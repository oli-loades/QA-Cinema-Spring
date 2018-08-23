package com.qa.business.service;

import com.qa.persistence.domain.OrderFilm;
import com.qa.persistence.domain.OrderTicket;
import com.qa.persistence.domain.Ticket;
import com.qa.persistence.repository.OrderRepository;
import com.qa.persistence.repository.OrderTicketRepository;
import com.qa.persistence.repository.TicketRepository;
import com.qa.util.OrderTicketDto;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderTicketService {

	@Autowired
	private OrderTicketRepository orderTicketRepo;

	@Autowired
	private OrderRepository orderRepo;

	@Autowired
	private TicketRepository ticketRepo;

	public String add(OrderTicketDto orderTicketDto) {
		String msg = "{\"message\": \"ticket sucessfully added to order\"}";

		OrderTicket orderTicket = new OrderTicket();

		Optional<OrderFilm> order = orderRepo.findById(orderTicketDto.getOrder());
		Optional<Ticket> ticket = ticketRepo.findById(orderTicketDto.getTicket());

		if (order.isPresent() && ticket.isPresent()) {
			orderTicket.setOrder_id(order.get().getId());
			orderTicket.setTicket(ticket.get());
			orderTicket.setQuantity(orderTicketDto.getQuantity());
			orderTicketRepo.save(orderTicket);
		} else {
			msg = "{\"error\": \"cannot add ticket to order\"}";
		}

		return msg;
	}
}
