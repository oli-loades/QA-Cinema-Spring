package com.qa.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import com.qa.business.service.MovieService;
import com.qa.constants.MovieConstants;
import com.qa.persistence.domain.Movie;
import com.qa.util.MovieDto;

@RequestMapping("/movie")
@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class MovieController {

	@Autowired 
	private MovieService service; 
	
	@GetMapping("/search/{keyword}")
	public List<MovieDto> search(@PathVariable String keyword){
		return service.search(keyword); 
	}

	@GetMapping("/getAll")
	public List<MovieDto> getAllMovies(){
		return service.getAll();
	}
	
	@PostMapping("/add")
	public String addMovie(@RequestBody  Movie movie) {
		return service.addMovie(movie);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteMovie(@PathVariable Long id) {
		return service.deleteMovie(id);
	}
	
}
