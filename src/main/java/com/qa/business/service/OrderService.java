package com.qa.business.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.qa.persistence.domain.Account;
import com.qa.persistence.domain.Movie;
import com.qa.persistence.domain.OrderFilm;
import com.qa.persistence.repository.AccountRepository;
import com.qa.persistence.repository.MovieRepository;
import com.qa.persistence.repository.OrderRepository;
import com.qa.util.OrderDto;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepo;

	@Autowired
	private MovieRepository movieRepo;

	@Autowired
	private AccountRepository accountRepo;

	public List<OrderFilm> getAll() {
		return orderRepo.findAll();
	}

	public long add(OrderDto orderDto) {
		long id = -1;

		OrderFilm order = new OrderFilm();

		Optional<Movie> movie = movieRepo.findById(orderDto.getMovie());
		Optional<Account> account = accountRepo.findByEmail(orderDto.getEmail());

		if (movie.isPresent() && account.isPresent()) {
			order.setMovie(movie.get());
			order.setAccount_id(account.get().getId());
			orderRepo.save(order);
			id = order.getId();
		}
		
		return id;
	}

	public String deleteOrder(long id) {
		orderRepo.deleteById(id);
		return "{\"message\": \"order sucessfully removed\"}";
	}

	public String updateOrder(OrderFilm orderToUpdate, long id) {
		Optional<OrderFilm> order = orderRepo.findById(id);
		if (order.isPresent()) {
			orderToUpdate.setId(id);
		}
		orderRepo.save(orderToUpdate);
		return "{\"message\": \"order sucessfully updated\"}";
	}

	public List<OrderFilm> getAllByAccount(@PathVariable Long id) {
		return orderRepo.getAllByAccount(id);
	}
}
