package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class DemoRestController {

	
	@GetMapping("/data")
	@CircuitBreaker(fallbackMethod = "getDataFromDB" , name = "abhirat_TO")
	public String getDataFromRedis()
	{
		System.out.println("redis() - method executed");
		
		// Logic to connect with redis
		//int i = 10/000;
		return "Data Fetched From Redis Server";
		
	}
	
	public String getDataFromDB(Throwable t)
	{
		System.out.println("-----db() - Method Got Executed.....");
		// Logic to Connect with db
		return "Data Fetched From DB Server" ;
	}
}
