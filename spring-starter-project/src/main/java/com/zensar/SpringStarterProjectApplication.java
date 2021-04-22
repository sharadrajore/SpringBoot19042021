package com.zensar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zensar.controllers.UserController;
import com.zensar.entities.User;

@SpringBootApplication
public class SpringStarterProjectApplication  implements ApplicationRunner  {
	
	@Autowired
	private   UserController controller;

	public static void main(String[] args) {
		SpringApplication.run(SpringStarterProjectApplication.class, args);
	}


	@Override
	public void run(ApplicationArguments args) throws Exception {
		User user = new User(1,"user",12,"user@test.com");
		controller.insertUser(user);
		
	}

	
	

}
