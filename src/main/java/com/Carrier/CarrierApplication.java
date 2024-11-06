package com.Carrier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.Carrier.Repository")
public class CarrierApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarrierApplication.class, args);
	}

}
