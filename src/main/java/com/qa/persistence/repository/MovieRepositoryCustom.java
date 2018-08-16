package com.qa.persistence.repository;

import java.util.List;

import com.qa.persistence.domain.MovieModel;

public interface MovieRepositoryCustom {
	List<MovieModel> findByTitle(String title);
}
