package com.ankur.architect.archservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableEurekaServer
@EnableJpaRepositories("com.ankur.architect.archservice.repository")
public class ArchServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArchServiceApplication.class, args);
    }

}
