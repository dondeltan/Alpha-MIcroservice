package com.microservice.boot.alpha.controller;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservice.boot.alpha.models.User;

@FeignClient(name = "boot-Mongo", url = "${BOOT_MONGO_URI:http://localhost}:8080")//
//@FeignClient(name = "currency-exchange", url = "${CURRENCY_EXCHANGE_SERVICE_HOST:http://localhost}:8000")
//@FeignClient(name = "currency-exchange-service")//Kubernetes Service Name
public interface SpringMongoProxy {
	//http://localhost:8000/currency-exchange/from/USD/to/INR
	@GetMapping("/rest/users/all")
	public List<User> retrieveMongodata();
}