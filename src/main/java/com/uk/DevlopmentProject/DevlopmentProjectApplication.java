package com.uk.DevlopmentProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevlopmentProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevlopmentProjectApplication.class, args);
	}

	@GetMapping("/")
	public String hello() {
		return String.format("Hello Development Project");
	      
	    }

}
