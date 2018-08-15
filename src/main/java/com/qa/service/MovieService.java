package com.qa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.qa.constants.MovieConstants;
@Component 
public class MovieService {

	
	@Autowired
	private RestTemplate restTemplate; 
	
	public String getAPIKey(String keyword){
		String key;
		key = restTemplate.getForObject(MovieConstants.ADDRESS + keyword + MovieConstants.API_KEY, String.class); 
		return key; 
	}

}
