package com.qa.controller;

import com.qa.business.service.OrderTicketService;
import com.qa.persistence.domain.OrderTicket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/order/ticket")
@CrossOrigin(origins = "http://localhost:8080")
public class OrderTicketController {

    @Autowired
    private OrderTicketService orderTicketServ;

    @PostMapping("/add")
    public String addTicketToOrder(@RequestBody OrderTicket ticket){
        return orderTicketServ.add(ticket);
    }
}
