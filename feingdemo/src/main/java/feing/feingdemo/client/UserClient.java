package feing.feingdemo.client;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import feing.feingdemo.dto.UserResponse;

@FeignClient(url="https://jsonplaceholder.typicode.com",name="USER-CLIENT")
public interface UserClient {
	
	@GetMapping("/users")
	public List<UserResponse> getUsers();

}
