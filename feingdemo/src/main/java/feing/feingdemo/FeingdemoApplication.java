package feing.feingdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import feing.feingdemo.client.UserClient;
import feing.feingdemo.dto.UserResponse;

@SpringBootApplication
@RestController
@EnableFeignClients
public class FeingdemoApplication {
	@Autowired
	private UserClient client;
	
	
	@GetMapping("/findAllUser")
	public List<UserResponse> getAllUser(){
		return client.getUsers();
		
	}

	public static void main(String[] args) {
		SpringApplication.run(FeingdemoApplication.class, args);
	}

}
