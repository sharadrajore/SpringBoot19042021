package com.zensar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.zensar.controllers.UserController;
import com.zensar.entities.User;

@SpringBootApplication
public class SpringStarterProjectApplication  {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(SpringStarterProjectApplication.class, args);
		
		// UserController bean = (UserController)context.getBean("userController");
		UserController bean = context.getBean("user",UserController.class);
		User user1 = new User(1,"test",20,"test@gmail.com");
		User user2 = new User(2,"user",30,"user@gmail.com");
		bean.insertUser(user1);
		bean.insertUser(user2);
		/*
		 * SpringApplication springApplication = new
		 * SpringApplicationBuilder(SpringStarterProjectApplication.class)
		 * .properties("spring.config.name=myapplication") .build();
		 * springApplication.run(args);
		 */
	}

	
	

}
