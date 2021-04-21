package com.zensar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringStarterProjectApplication  {

	public static void main(String[] args) {
		//SpringApplication.run(SpringStarterProjectApplication.class, args);
		
		SpringApplication springApplication = new SpringApplicationBuilder(SpringStarterProjectApplication.class)
		.properties("spring.config.name=myapplication")
		.build();
		springApplication.run(args);
	}

	
	

}
