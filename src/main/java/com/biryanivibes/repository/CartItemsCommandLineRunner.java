package com.biryanivibes.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;


public class CartItemsCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	CartItemsRepository cartItemsRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

	}

}
