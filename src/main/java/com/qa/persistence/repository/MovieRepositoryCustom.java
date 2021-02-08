package com.qa.persistence.repository;

import java.util.List;

import com.qa.persistence.domain.Movie;

public interface MovieRepositoryCustom {
	List<Movie> findByTitle(String title);
}
