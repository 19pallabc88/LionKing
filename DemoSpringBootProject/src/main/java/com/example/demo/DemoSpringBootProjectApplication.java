package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;


@SpringBootApplication
@Configuration
@ComponentScan({"controller", "service"})
public class DemoSpringBootProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBootProjectApplication.class, args);
	}
}
