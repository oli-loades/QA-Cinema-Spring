package com.qa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController("/Ticket")
public class TicketContoller {
    @Autowired
    TiicketResponisity ticketResponisy;

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public List<Ticket> getTickets(){
         return ticketResponisy.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addTicket(@RequestBody Ticket ticketToAdd){

        ticketResponisy.save(ticketToAdd);
    }

    @PutMapping("{id}")
    public void  updaqteTicket(Ticket tickToUpdate, @PathVariable Long ticketId){
        Optional<Ticket>  ticketOptional  = ticketResponisy.findById(ticketId);

        tickToUpdate.setTicketId(ticketId);
        ticketResponisy.save(tickToUpdate);

    }

    @DeleteMapping("{id}")
    public void  deleateTicket(@PathVariable Long id){
        ticketResponisy.deleteById(id);
    }

    @GetMapping("{id}")
    public Ticket getOneTicket(@PathVariable Long id){
         return ticketResponisy.getOne(id);
    }


}
