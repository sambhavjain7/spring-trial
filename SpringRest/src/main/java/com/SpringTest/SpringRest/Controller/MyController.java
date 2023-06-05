package com.SpringTest.SpringRest.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	

	@GetMapping("/")
	public String Home0() 
	{
		return "You are at Landing";
	}
	
	@GetMapping("/home")
	public String Home() 
	{
		return "I am home";
	}
	
	

}
