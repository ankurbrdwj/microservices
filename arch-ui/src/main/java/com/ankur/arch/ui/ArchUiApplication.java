package com.ankur.arch.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ArchUiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArchUiApplication.class, args);
	}

}
