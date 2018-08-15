package com.qa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/Ticket")
public class TicketContoller {
    @Autowired
    TiicketResponisity ticketResponisy;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Ticket> getTickets(){
         return ticketResponisy.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addTicket(@RequestBody Ticket ticketToAdd){

        ticketResponisy.save(ticketToAdd);
    }

    @PutMapping
}
