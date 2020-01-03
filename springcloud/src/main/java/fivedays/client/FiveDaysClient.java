package fivedays.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import fivedays.dto.FiveDaysReponse;




@FeignClient(url="https://www.metaweather.com/api/location",name="FIVE-DAYS-CLIENT")
public interface FiveDaysClient {
	
	@GetMapping("/api/location/{woeid}")
	public List<FiveDaysReponse> getWoeid(@PathVariable Integer woeid);
	
	

}
