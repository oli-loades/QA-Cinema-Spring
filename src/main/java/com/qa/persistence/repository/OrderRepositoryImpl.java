package com.qa.persistence.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.qa.persistence.domain.Movie;
import com.qa.persistence.domain.OrderFilm;

public class OrderRepositoryImpl implements OrderRepositoryCustom{
	
	@PersistenceContext
    private EntityManager entityManager;
	
	public List<OrderFilm> getAllByAccount(long id) {
		Query query = entityManager.createNativeQuery("SELECT * FROM orderfilm WHERE account=" + id, Movie.class);
		return query.getResultList();
	}
}
