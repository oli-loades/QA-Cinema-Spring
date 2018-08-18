package com.qa.business.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.qa.persistence.domain.OrderFilm;
import com.qa.persistence.repository.OrderRepository;

@Service
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
	
	public String deleteOrder(long id) {
		orderRepo.deleteById(id);
		return "{\"message\": \"order sucessfully removed\"}";
	}
	
	public String updateOrder(OrderFilm orderToUpdate,long id) {
		Optional<OrderFilm> order = orderRepo.findById(id);
		if (order.isPresent()) {
			orderToUpdate.setId(id);
		}
		orderRepo.save(orderToUpdate);
		return "{\"message\": \"order sucessfully updated\"}";
	}
	
	public List<OrderFilm> getAllByAccount(@PathVariable Long id){
		return orderRepo.getAllByAccount(id);
	}
}
