package com.example.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestService {
	
	@GetMapping("/welcome")
	public String greetService() {
		return "Welcome Service 1 is up and Running";
	}

}
