package com.qa.persistence.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.qa.persistence.domain.Movie;

public class MovieRepositoryImpl implements MovieRepositoryCustom{
	
	@PersistenceContext
    private EntityManager entityManager;

	@Override
	public List<Movie> findByTitle(String title) {
		Query query = entityManager.createNativeQuery("SELECT * FROM movie WHERE title LIKE'" + title + "'", Movie.class);
		return query.getResultList();
	}

}
