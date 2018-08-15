package com.qa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.qa.constants.MovieConstants;
import com.qa.model.MovieModel;
import com.qa.service.MovieService;
import com.qa.util.MovieDto;


@RestController
public class MovieController {

	@Autowired 
	private MovieService service; 
	
	@GetMapping("/search/{keyword}")
	public List<MovieDto> search(@PathVariable String keyword){
		return service.getAPIKey(keyword); 
	}

	@GetMapping("/getAll")
	public List<MovieDto> getAllMovies(){
		return service.getAll();
	}
	
	@PostMapping("/add")
	public String addMovie(@RequestBody  MovieModel movie) {
		return service.addMovie(movie);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteMovie(@PathVariable Long id) {
		return service.deleteMovie(id);
	}
	
}
