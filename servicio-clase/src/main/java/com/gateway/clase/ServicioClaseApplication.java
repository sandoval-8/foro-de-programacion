package com.gateway.clase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServicioClaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioClaseApplication.class, args);
	}

}
