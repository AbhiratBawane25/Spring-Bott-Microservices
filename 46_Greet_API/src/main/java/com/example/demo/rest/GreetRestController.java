package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.clients.WelcomeApiFeignClient;

@RestController
public class GreetRestController 
{
	
	@Autowired
	private WelcomeApiFeignClient welcomeClient;
	
	@GetMapping("/greet")
	public String greetMsg()
	{
		String welcomeResp = welcomeClient.invokeWelcomeApi();
		
		String greetResp = " Good Morning..!!";
		
		return greetResp + welcomeResp;
	}

}
