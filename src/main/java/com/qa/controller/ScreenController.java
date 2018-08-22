package com.qa.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.qa.business.service.ScreenServices;



@RestController
@RequestMapping(value = "/screen")
@CrossOrigin(origins = "http://localhost:8080")
public class ScreenController {
	
	@Autowired
	private ScreenServices srcservice;
	
	@GetMapping(value= "/getall")
	public int getScreen(@RequestBody String movietitle) {
		return srcservice.getScreenNumber(movietitle);

}
}
