package com.sbps.main.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring-boot-actuator")
public class ActuatorTestController {

	@GetMapping("/test")
	public String testEndPoint() {
		return "Spring Boot Actuator EndPoint Added";
	}
}
