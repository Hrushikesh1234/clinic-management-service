package com.htc.appoitmentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableWebMvc
public class AppointmentServApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppointmentServApplication.class, args);
	}

}
