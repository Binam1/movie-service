package com.binam.movie.service.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
	@GetMapping
	public String welcome() {
		return "Welcome to my page!";
	}

	@GetMapping
	@RequestMapping("/user")
	public Principal getUser(Principal user) {
		return user;
	}

}
