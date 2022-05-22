package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("projectDetails")
public class TestController {
	
	@GetMapping("/name")
	public String getProjectName() {
		return "This response is from projectDetails endpoint and request method is get : projectDetails/name";
		
	}

}
