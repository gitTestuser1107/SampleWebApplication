package com.demo.SampleWebApplication;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	@Value("${data.from}")
	private String dataFrom;
	
	@GetMapping
	public String getSampleResponse() {
		return "Devops Evaluation in " + dataFrom;
	}

}
