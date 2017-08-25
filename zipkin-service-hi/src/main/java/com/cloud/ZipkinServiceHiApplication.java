package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ZipkinServiceHiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinServiceHiApplication.class, args);

	}

	@Bean
	public RestTemplate getRestTemplate(){
		return  new RestTemplate() ;
	}
}
