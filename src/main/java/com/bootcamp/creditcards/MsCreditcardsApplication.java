package com.bootcamp.creditcards;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsCreditcardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsCreditcardsApplication.class, args);
	}

}
