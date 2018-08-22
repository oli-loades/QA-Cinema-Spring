package com.qa.business.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.qa.persistence.domain.Ticket;
import com.qa.persistence.repository.TicketRespository;
import org.springframework.stereotype.Service;

@Service
public class TicketService {

	@Autowired
	private TicketRespository ticketRepo;

	public List<Ticket> getTickets() {
		return ticketRepo.findAll();
	}

	public String addTicket(Ticket ticketToAdd) {
		ticketRepo.save(ticketToAdd);
		return "{\"message\": \"ticket sucessfully added\"}";
	}

	public String updateTicket(Ticket ticketToUpdate, Long ticketId) {
		Optional<Ticket> ticket = ticketRepo.findById(ticketId);
		if (ticket.isPresent()) {
			ticketToUpdate.setTicketId(ticketId);
		}
		ticketRepo.save(ticketToUpdate);
		return "{\"message\": \"ticket sucessfully updated\"}";
	}

	public String deleteTicket(Long id) {
		ticketRepo.deleteById(id);
		return "{\"message\": \"ticket sucessfully added\"}";
	}
	
	public Optional<Ticket> getTicket(long id) {
		return ticketRepo.findById(id);
	}

}
