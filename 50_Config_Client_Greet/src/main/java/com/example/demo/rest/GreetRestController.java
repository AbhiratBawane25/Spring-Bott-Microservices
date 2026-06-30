package com.example.demo.rest;

import org.apache.logging.log4j.util.StringBuilderFormattable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController 
{
	@Value("${msg}")
	private String msgTxt;
	
	
	@GetMapping("/greet")
	public String getGreetMsg()
	{
		return msgTxt;
	}
	// main logic
	public String getDataFromRdis(){
		// logic to fetch data from redis
		return null;
		
	}
	
	public StringBuilderFormattable getDataFormDB()
	{
		// logic to fetch data from redis
		return null;
	}

}
