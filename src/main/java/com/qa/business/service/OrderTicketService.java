package com.qa.business.service;

import com.qa.persistence.domain.OrderTicket;
import com.qa.persistence.repository.OrderTicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderTicketService {

    @Autowired
    private OrderTicketRepository orderTicketRepo;

    public String add(OrderTicket ticket){
        orderTicketRepo.save(ticket);
        return "{\"message\": \"ticket sucessfully added to order\"}";
    }
}
