package com.kemalakcicek.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldDockerController {

	@GetMapping(path = "/hello-world")
	public String helloWorld() {

		return "KEMAL AKÇİÇEK";
	}

}
