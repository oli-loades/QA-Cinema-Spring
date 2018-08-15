package com.qa;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping (value="/Account")
public class Services {
	
	@Autowired
	userRepository accounts;
	
	@GetMapping
	public List<Account> getaccounts() {
		return accounts.findAll();
		
		
	}
	
	@PostMapping
	public void createaccount(@RequestBody Account account){
		 accounts.save(account);
	}

	
	
	
	
	

}
