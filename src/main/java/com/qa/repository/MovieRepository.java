package com.qa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.model.MovieModel;

@Repository
public interface MovieRepository extends JpaRepository<MovieModel, Long>, MovieRepositoryCustom{

}
