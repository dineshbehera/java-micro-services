package com.oned.servicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@SpringBootApplication
public class ApiGatewayApplication {
	public static void main(String[] args) {
		System.out.println("Request received !");
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

}
