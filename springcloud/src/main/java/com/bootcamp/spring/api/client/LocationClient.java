package com.bootcamp.spring.api.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.bootcamp.spring.api.dto.ServiceReponse;

@FeignClient(url="https://www.metaweather.com/api/location",name="LOCATION-CLIENT")
public interface LocationClient {
	
	
	@GetMapping("/search/?query={title}")
	public List<ServiceReponse> getLocation(@PathVariable String title);

}
