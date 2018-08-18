package com.qa.controller;

import com.qa.business.service.OrderTicketService;
import com.qa.persistence.domain.OrderTicket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/order/ticket")
public class OrderTicketController {

    @Autowired
    private OrderTicketService orderTicketServ;

    @PostMapping("/add")
    public String addTicketToOrder(@RequestBody OrderTicket ticket){
        return orderTicketServ.add(ticket);
    }
}
