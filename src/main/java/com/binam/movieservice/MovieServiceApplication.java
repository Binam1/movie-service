package com.binam.movieservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class MovieServiceApplication {
	
	public static Logger logger = LoggerFactory.getLogger(MovieServiceApplication.class);
	@GetMapping
	public String welcome() {
		return "Welcome to my page!";
	}

	public static void main(String[] args) {
		logger.info("Main method executing...");
		SpringApplication.run(MovieServiceApplication.class, args);
	}

}
