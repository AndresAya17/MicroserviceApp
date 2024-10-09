package com.domi.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DomiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(DomiGatewayApplication.class, args);
	}

}
