package com.example.demoresource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DemoresourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoresourceApplication.class, args);
	}
}
