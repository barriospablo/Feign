package com.bootcamp.spring.api.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.bootcamp.spring.api.dto.ServiceReponse;

@FeignClient(url="https://www.metaweather.com/api/location",name="LOCATION-CLIENT")
public interface LocationClient {
	
	
	@GetMapping("/search/?query=london")
	public List<ServiceReponse> getLocation();

}
