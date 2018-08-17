package com.qa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/Order")
public class OrderContoller {

       @Autowired
       OrderReposoinity orderReposoinity;

       @GetMapping
       @ResponseStatus(HttpStatus.OK)
       public List<OrderFilm> getOrder()
       {
           return  orderReposoinity.findAll();
       }

       @PostMapping
       @ResponseStatus(HttpStatus.CREATED)
       public void addOrder(@RequestBody OrderFilm orderFilmToAdd) {

              orderReposoinity.save(orderFilmToAdd);
       }

       @PutMapping("Ticket")
       @ResponseStatus(HttpStatus.CREATED)
       public void updateOrder(@RequestBody OrderFilm orderFilm, @PathVariable long id)
       {
             Optional<OrderFilm> orderFilmOptional  = orderReposoinity.findById(id);

              orderFilm.setId(id);
             orderReposoinity.save(orderFilm);
       }
       @DeleteMapping("{id}")
       @ResponseStatus(HttpStatus.NO_CONTENT)
       public void detelteOrder(@PathVariable Long id) {
              orderReposoinity.deleteById(id);


       }






}
