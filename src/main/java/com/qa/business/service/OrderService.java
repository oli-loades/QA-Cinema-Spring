package com.qa.business.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.qa.persistence.domain.OrderFilm;
import com.qa.persistence.repository.OrderRepository;

@Component
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepo;

	public List<OrderFilm> getAll() {
		return orderRepo.findAll();
	}

	public String add(OrderFilm order) {
		orderRepo.save(order);
		return "{\"message\": \"order sucessfully added\"}";
	}
}
