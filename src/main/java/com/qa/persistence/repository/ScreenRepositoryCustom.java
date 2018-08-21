package com.qa.persistence.repository;

import java.util.Optional;

import com.qa.persistence.domain.Screens;

public interface ScreenRepositoryCustom {

Optional<Screens> findByMovieTitle(String movietitle);


}
