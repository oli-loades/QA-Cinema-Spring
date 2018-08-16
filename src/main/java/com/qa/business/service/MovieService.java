package com.qa.business.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.qa.constants.MovieConstants;
import com.qa.persistence.domain.MovieModel;
import com.qa.persistence.repository.MovieRepository;
import com.qa.util.MovieDto;

@Component
public class MovieService {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private MovieRepository movieRepo;

	public List<MovieDto> getAPIKey(String keyword) {
		List<MovieModel> movie = movieRepo.findByTitle(keyword);
		List<MovieDto> movies = new ArrayList<>();

		for (MovieModel m : movie) {
			MovieDto mov = restTemplate.getForObject(
					MovieConstants.ADDRESS + m.getImdbID() + MovieConstants.API_KEY, MovieDto.class);
			mov.setId(m.getId());
			movies.add(mov);
		}

		return movies;
	}
	
	public List<MovieDto> getAll(){
		List<MovieModel> allMovies = movieRepo.findAll();
		List<MovieDto> movies = new ArrayList<>();

		for (MovieModel m : allMovies) {
			MovieDto mov = restTemplate.getForObject(
					MovieConstants.ADDRESS + m.getImdbID() + MovieConstants.API_KEY, MovieDto.class);
			mov.setId(m.getId());
			movies.add(mov);
		}

		return movies;
	}
	
	public String addMovie(MovieModel movie) {
		movieRepo.save(movie);
		return "{\"message\": \"movie sucessfully added\"}";
	}
	
	public String deleteMovie(long id) {
		movieRepo.deleteById(id);
		return "{\"message\": \"movie sucessfully deleted\"}";
	}
	

}
