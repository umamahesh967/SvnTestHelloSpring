package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
@SpringBootApplication
public class TestJarFileApplication {

        @Value("${server.port}")
        private String value;

        @Value("${app.prop1}")
        private String u;

        @Value("${WORDPRESS_DB_HOSTURL}")
        private String last;

        @Value("${app.prop2}")
        private String middle;

        @Value("${ENV1}")
        private String first;

        @Value("${app.prop3}")
        private String env;

        @Value("${app.prop4}")
        private String name;

	public static void main(String[] args) {
		SpringApplication.run(TestJarFileApplication.class, args);
	}
	
	// go to localhost:8121
	@GetMapping("/")
	public String home() {	

	//	return System.getenv("WORDPRESS_DB_HOSTURL")+":"+value+":"+u+":"+last;


         return value+":"+u+":"+last+":"+middle+":"+first+":"+env;
		
	}

	// go to localhost:8121
	@GetMapping("/hello")
	public String hello() {	

	//	return System.getenv("WORDPRESS_DB_HOSTURL")+":"+value+":"+u+":"+last;

         return "Hello " + name + " ! :) "; 
		
	}
}
