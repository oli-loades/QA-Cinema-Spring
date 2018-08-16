package com.qa.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.qa.persistence.domain.Movie;


@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>, MovieRepositoryCustom{

}
