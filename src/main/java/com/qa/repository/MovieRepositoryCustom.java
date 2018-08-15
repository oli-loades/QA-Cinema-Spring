package com.qa.repository;

import java.util.List;

import com.qa.model.MovieModel;

public interface MovieRepositoryCustom {
	List<MovieModel> findByTitle(String title);
}
