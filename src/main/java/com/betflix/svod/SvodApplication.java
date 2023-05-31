package com.betflix.svod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SvodApplication {

	public static void main(String[] args) {
		SpringApplication.run(SvodApplication.class, args);
	}

	@GetMapping("/svod")
	public Movie svod() {
		return new Movie(1, "TeNeT");
	}

}
