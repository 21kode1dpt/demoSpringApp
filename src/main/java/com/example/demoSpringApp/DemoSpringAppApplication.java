package com.example.demoSpringApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class DemoSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringAppApplication.class, args);
	}

}
