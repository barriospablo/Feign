package com.bootcamp.spring.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.spring.api.client.LocationClient;
import com.bootcamp.spring.api.dto.ServiceReponse;

@SpringBootApplication
@RestController
@EnableFeignClients
public class SpringcloudApplication {
	
	@Autowired
	private LocationClient client;
	
	@GetMapping("/findAllLocation")
	
	public List<ServiceReponse> getAllLocation(){
		
		return client.getLocation();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudApplication.class, args);
	}

}
