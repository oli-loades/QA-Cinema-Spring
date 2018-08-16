package com.qa.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import  org.springframework.web.bind.annotation.RestController;

import com.qa.business.service.OrderService;
import com.qa.persistence.domain.OrderFilm;

import  org.springframework.web.bind.annotation.RequestBody;
import  org.springframework.web.bind.annotation.ResponseStatus;




import java.util.List;

@RestController
@RequestMapping(value="/Order")
public class OrderContoller {

       @Autowired
       private OrderService orderServ;

       @GetMapping("/getAll")
       @ResponseStatus(HttpStatus.OK)
       public List<OrderFilm> getAllOrders()
       {
           return  orderServ.getAll();
       }

       @PostMapping
       @ResponseStatus(HttpStatus.CREATED)
       public String addOrder(@RequestBody OrderFilm orderFilmToAdd) {
             return orderServ.add(orderFilmToAdd);
       }

//       @PutMapping("{id}")
//       @ResponseStatus(HttpStatus.CREATED)
//       public void updateOrder(@PathVariable  )
//       { orderReposoinity.
//       }




}
