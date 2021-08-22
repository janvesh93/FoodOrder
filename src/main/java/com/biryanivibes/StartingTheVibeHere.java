package com.biryanivibes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
public class StartingTheVibeHere {
	public static void main(String[] args) {
		ApplicationContext act= SpringApplication.run(StartingTheVibeHere.class, args);
	}
}

