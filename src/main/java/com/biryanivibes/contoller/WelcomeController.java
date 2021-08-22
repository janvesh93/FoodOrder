package com.biryanivibes.contoller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.biryanivibes.service.WelcomeService;

@RestController
public class WelcomeController {
	
	@Autowired
	WelcomeService welcomeService;
	
	

	@RequestMapping(value="/welcome", method = RequestMethod.GET)
	public String welcome() {
		return welcomeService.welcomeMessage();
	}
	
	
	
	
}
