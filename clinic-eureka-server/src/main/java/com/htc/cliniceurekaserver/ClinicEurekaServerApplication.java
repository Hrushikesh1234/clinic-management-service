package com.htc.cliniceurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ClinicEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClinicEurekaServerApplication.class, args);
	}

}
