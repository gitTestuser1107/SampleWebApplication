package com.demo.SampleWebApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping
	public String getSampleResponse() {
		return "Welcome to the world of Spring Boot";
	}

}
