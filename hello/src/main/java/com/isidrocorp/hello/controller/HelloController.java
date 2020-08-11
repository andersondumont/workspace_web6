package com.isidrocorp.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World! - Projeto Spring Boot";
	}
	@GetMapping("/outrohello")
	public String sayHelloAgain() {
		return "Doideira, outro hello";
	}
}