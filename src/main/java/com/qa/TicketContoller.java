package com.qa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController("/")
public class TicketContoller {
    @Autowired
    TiicketResponisity ticketResponisy;

    @GetMapping("Ticket/allTickets")
    @ResponseStatus(HttpStatus.OK)
    public List<Ticket> getTickets(){
         return ticketResponisy.findAll();
    }

    @PostMapping("Ticket")
    @ResponseStatus(HttpStatus.CREATED)
    public void addTicket(@RequestBody Ticket ticketToAdd){

        ticketResponisy.save(ticketToAdd);
    }

    @PutMapping("Ticket/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public void  updaqteTicket(@RequestBody Ticket ticket, @PathVariable long id){
        Optional<Ticket> ticketOptional = ticketResponisy.findById(id);

        ticket.setId(id);
        ticketResponisy.save(ticket);
    }

    @DeleteMapping("Ticket/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleateTicket(@PathVariable long id){
        ticketResponisy.deleteById(id);
    }

    @GetMapping("Ticket/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Ticket getOneTicket(@PathVariable long id){
        return ticketResponisy.getOne(id);
    }



}
