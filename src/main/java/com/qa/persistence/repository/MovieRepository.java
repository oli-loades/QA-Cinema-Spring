package com.qa.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.persistence.domain.MovieModel;

@Repository
public interface MovieRepository extends JpaRepository<MovieModel, Long>, MovieRepositoryCustom{

}
