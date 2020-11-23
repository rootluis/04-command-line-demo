package com.mx.mejia.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	@GetMapping("/")
	public String sayHello() {
		return "Hello Wordl! Time on server is : " + LocalDateTime.now();
	}
	
	@GetMapping("/workout")
	public String workout() {
		return "Run hard 5K!....";
	}

}
