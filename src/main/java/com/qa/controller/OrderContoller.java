package com.qa.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.business.service.OrderService;
import com.qa.persistence.domain.OrderFilm;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@RestController
@RequestMapping(value = "/order")
public class OrderContoller {

	@Autowired
	private OrderService orderServ;

	@GetMapping("/getAll")
	@ResponseStatus(HttpStatus.OK)
	public List<OrderFilm> getAllOrders() {
		return orderServ.getAll();
	}
	
	@GetMapping("/getAllByAccount/{id}")
	public List<OrderFilm> getAllByAccount(@PathVariable Long id){
		return orderServ.getAllByAccount(id);
	}

	@PostMapping("/add")
	@ResponseStatus(HttpStatus.CREATED)
	public String addOrder(@RequestBody OrderFilm orderFilmToAdd) {
		return orderServ.add(orderFilmToAdd);
	}

	@PutMapping("/update/{id}")
	public String updateOrder(@RequestBody OrderFilm orderFilm, @PathVariable long id) {
		return orderServ.updateOrder(orderFilm, id);
	}

	@DeleteMapping("/delete/{id}")
	public String detelteOrder(@PathVariable Long id) {
		return orderServ.deleteOrder(id);
	}

}
