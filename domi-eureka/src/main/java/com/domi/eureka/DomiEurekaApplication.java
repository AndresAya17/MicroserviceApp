package com.domi.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DomiEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DomiEurekaApplication.class, args);
	}

}
