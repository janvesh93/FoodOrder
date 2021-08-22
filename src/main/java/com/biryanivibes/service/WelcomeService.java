package com.biryanivibes.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service
public class WelcomeService {
	@GetMapping(value="/welcome")
	public String welcomeMessage() {
		return "Heyaaa Hungry Howies! Lets get started, Namasthey";
	}

}
