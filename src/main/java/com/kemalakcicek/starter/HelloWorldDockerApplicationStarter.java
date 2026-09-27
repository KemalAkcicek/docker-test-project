package com.kemalakcicek.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.kemalakcicek" })
public class HelloWorldDockerApplicationStarter {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldDockerApplicationStarter.class, args);
	}

}
