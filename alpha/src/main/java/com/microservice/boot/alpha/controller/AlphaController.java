package com.microservice.boot.alpha.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.microservice.boot.alpha.models.User;


@RestController
public class AlphaController {

	@Autowired
	private SpringMongoProxy proxy;
	
	@GetMapping("/")
	public String imHealthy() {
		return "{healthy:true}";
	}
	
		@GetMapping("/getdata")
		public List<User> retrieveExchangeValue() {
			
			List<User> response = proxy.retrieveMongodata();
			
			return response;
		}

}
