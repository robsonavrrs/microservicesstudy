package com.example.demooauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DemooauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemooauthApplication.class, args);
	}
}
