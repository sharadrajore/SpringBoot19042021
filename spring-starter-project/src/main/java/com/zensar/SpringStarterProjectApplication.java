package com.zensar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zensar.controllers.UserController;
import com.zensar.entities.User;

@SpringBootApplication
public class SpringStarterProjectApplication  implements CommandLineRunner  {
	
	@Autowired
	private   UserController controller;

	public static void main(String[] args) {
		SpringApplication.run(SpringStarterProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		User user = new User(1,"test",12,"test@test.com");
		controller.insertUser(user);
	}

	
	

}
