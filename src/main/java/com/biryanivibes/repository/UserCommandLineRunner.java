package com.biryanivibes.repository;

import java.util.ArrayList;

import org.h2.command.CommandInterface;
import org.h2.expression.ParameterInterface;
import org.h2.result.ResultInterface;
import org.h2.result.ResultWithGeneratedKeys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.biryanivibes.StartingTheVibeHere;
import com.biryanivibes.model.User;

@Component
public class UserCommandLineRunner implements CommandLineRunner{
	
	private static final Logger log = LoggerFactory.getLogger(StartingTheVibeHere.class);

    
    
	@Autowired
	private UserRepository repository;
	
	
	public void run(String... args) throws Exception {
		
		
		log.info("StartApplication...");
		repository.save(new User("anvesh", "anv", "123",  "203 North Wilmot Rd","Tucson","AZ", "85711","customer"));
		repository.save(new User("anvesh", "anv", "123",  "203 North Wilmot Rd","Tucson","AZ", "85711","customer"));
		// TODO Auto-generated method stub
		
		repository.findAll();
		
		
		
	}

	
}
