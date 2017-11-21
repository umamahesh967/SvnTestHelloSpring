package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TestJarFileApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestJarFileApplication.class, args);
	}
	
	// go to localhost:8121
	@GetMapping("/")
	public String home() {
		System.out.println(System.getenv("HOMESE"));
		System.out.println(System.getenv("HOM"));
		return System.getenv("DISABLE_AUTH")+":"+System.getenv("DB_ENGINE");
	}
}
