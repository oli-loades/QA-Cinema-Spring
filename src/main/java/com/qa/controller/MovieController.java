package com.qa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.qa.constants.MovieConstants;
import com.qa.service.MovieService;


@RestController
public class MovieController {

	@Autowired 
	private MovieService service; 
	
	@GetMapping("/search/{keyword}")
	public String search(@PathVariable String keyword)
	{
		return service.getAPIKey(keyword);
		
	}


}
