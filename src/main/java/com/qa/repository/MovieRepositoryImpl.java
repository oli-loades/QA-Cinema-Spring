package com.qa.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.qa.model.MovieModel;

public class MovieRepositoryImpl implements MovieRepositoryCustom{
	
	@PersistenceContext
    private EntityManager entityManager;

	@Override
	public List<MovieModel> findByTitle(String title) {
		Query query = entityManager.createNativeQuery("SELECT * FROM movie WHERE title LIKE'" + title + "'", MovieModel.class);
		return query.getResultList();
	}

}
