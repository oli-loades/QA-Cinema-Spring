package com.qa.business.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.qa.constants.MovieConstants;
import com.qa.persistence.domain.Movie;
import com.qa.persistence.repository.MovieRepository;
import com.qa.util.MovieDto;

@Service
public class MovieService {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private MovieRepository movieRepo;

	public List<MovieDto> search(String keyword) {
		List<Movie> movie = movieRepo.findByTitle(keyword);
		List<MovieDto> movies = new ArrayList<>();

		for (Movie m : movie) {
			MovieDto mov = restTemplate.getForObject(
					MovieConstants.ADDRESS + m.getImdbID() + MovieConstants.API_KEY, MovieDto.class);
			mov.setId(m.getId());
			movies.add(mov);
		}

		return movies;
	}
	
	public List<MovieDto> getAll(){
		List<Movie> allMovies = movieRepo.findAll();
		List<MovieDto> movies = new ArrayList<>();

		for (Movie m : allMovies) {
			MovieDto mov = restTemplate.getForObject(
					MovieConstants.ADDRESS + m.getImdbID() + MovieConstants.API_KEY, MovieDto.class);
			mov.setId(m.getId());
			movies.add(mov);
		}

		return movies;
	}
	
	public String addMovie(Movie movie) {
		movieRepo.save(movie);
		return "{\"message\": \"movie sucessfully added\"}";
	}
	
	public String deleteMovie(long id) {
		movieRepo.deleteById(id);
		return "{\"message\": \"movie sucessfully deleted\"}";
	}
	

}
