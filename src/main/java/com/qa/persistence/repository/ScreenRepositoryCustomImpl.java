package com.qa.persistence.repository;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.qa.persistence.domain.Screens;



public class ScreenRepositoryCustomImpl implements ScreenRepositoryCustom{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Optional<Screens> findByMovieTitle(String movietitle){
		Query query = entityManager.createNativeQuery("SELECT * FROM screen WHERE movie_title= '" + movietitle + "'", Screens.class);
		Optional<Screens> screeninfo;
		screeninfo = Optional.of((Screens) query.getSingleResult());
		return screeninfo;
	}
	
}
