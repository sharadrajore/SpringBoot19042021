package com.zensar.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.entities.User;

@RestController
public class UserController {
	
	List<User> users=new ArrayList<>();
	
	 public UserController() {
		users.add(new User(1,"Ram",30,"ram@gamil.com"));
		users.add(new User(2,"Seeta",28,"seeta@gamil.com"));
		users.add(new User(3,"Laxman",26,"laxman@gamil.com"));
	}
	
	
	// http://localhost:8080/users
	
	@RequestMapping("/users")
	public List<User> getAllUsers() {
		return users;
	}
	
	
	// http://localhost:8080/users/{userId}
	@RequestMapping("/users/{userId}")
	public User getUser(@PathVariable("userId")int userId) {
		
		for(User user:users) {
			if(user.getUserId()==userId) {
				return user;
			}
			
		}
	
		return null;
	}
	
	
	

}
