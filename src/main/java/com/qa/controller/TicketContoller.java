package com.qa.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.qa.business.service.TicketService;
import com.qa.persistence.domain.Ticket;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/ticket")
public class TicketContoller {

	@Autowired
	private TicketService ticketServ;

	@GetMapping("/getAll")
	@ResponseStatus(HttpStatus.OK)
	public List<Ticket> getTickets() {
		return ticketServ.getTickets();
	}

	@PostMapping("/add")
	@ResponseStatus(HttpStatus.CREATED)
	public String addTicket(@RequestBody Ticket ticketToAdd) {
		return ticketServ.addTicket(ticketToAdd);
	}

	@PutMapping("/edit/{id}")
	public String updaqteTicket(Ticket ticketToUpdate, @PathVariable Long ticketId) {
		return ticketServ.updateTicket(ticketToUpdate, ticketId);

	}

	@DeleteMapping("/delete/{id}")
	public String deleteTicket(@PathVariable Long id) {
		return ticketServ.deleteTicket(id);
	}

	@GetMapping("/get/{id}")
	public Optional<Ticket> getTicket(@PathVariable long id) {
		return ticketServ.getTicket(id);
	}

}
