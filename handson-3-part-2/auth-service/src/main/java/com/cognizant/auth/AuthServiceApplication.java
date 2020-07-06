package com.cognizant.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.cognizant.auth.service.UserDataService;
import com.cognizant.auth.service.UserDataServiceImpl;

@SpringBootApplication
@EnableDiscoveryClient
public class AuthServiceApplication {


	public static void main(String[] args) {
		SpringApplication.run(AuthServiceApplication.class, args);
		
	}

}
