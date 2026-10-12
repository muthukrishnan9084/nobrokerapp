package com.no_broker_app.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/broker")
public class customer {
	
	//http://localhost:8080/api/broker/welcome
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome";
	}

	//http://localhost:8080/api/broker/hello
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	
}
