package com.training.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/hello")
	public String greet() {
		return "<h1>Hello World!!! from v2</h1>";	
	}
	
	@GetMapping("/aboutus")
	public String aboutUs() {
		return "<h1>About US Page</h1>";		
	}
	
	@GetMapping("/contactus")
	public String contactUs() {
		return "<h1>About US Page</h1>";		
	}
}
