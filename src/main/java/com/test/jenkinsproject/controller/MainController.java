package com.test.jenkinsproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/test")
	public String getVal() {
		return "Hi Arijit. Application is running ....";
	}
	
	@GetMapping("/test1")
	public String getVal1() {
		return "Hi Sananda. Application is running ....";
	}
}
