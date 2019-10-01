package com.ankur.architect.arch.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableEurekaClient
@EnableJpaRepositories("com.ankur.architect.arch.order.repository")
@SpringBootApplication
public class ArchOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArchOrderServiceApplication.class, args);
	}

}
