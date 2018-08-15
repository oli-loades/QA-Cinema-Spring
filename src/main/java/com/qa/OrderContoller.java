package com.qa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import  org.springframework.web.bind.annotation.RestController;
import  org.springframework.web.bind.annotation.RequestBody;
import  org.springframework.web.bind.annotation.ResponseStatus;




import java.util.List;

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

//       @PutMapping("{id}")
//       @ResponseStatus(HttpStatus.CREATED)
//       public void updateOrder(@PathVariable  )
//       { orderReposoinity.
//       }




}
