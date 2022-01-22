package com.example.flywayTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class FlywayTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlywayTestApplication.class, args);
	}
	@RequestMapping(value ="/persons")
	public String hello() {
		return "Hello World";
	}
}
