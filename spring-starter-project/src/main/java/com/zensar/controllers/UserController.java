package com.zensar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.entities.User;
import com.zensar.services.UserService;

@RestController(value = "user")

@RequestMapping(produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, consumes = {
		MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })

public class UserController {

	@Autowired
	private UserService service;

	// CRUD C-Create R -> Read(one,all) ,U -> update,D -> Delete

	// http://localhost:8080/users

	// GET

	// @RequestMapping(value="/users",method=RequestMethod.GET)
	@GetMapping(value = "/users")
	public List<User> getAllUsers() {
		return service.getAllUsers();
	}

	// http://localhost:8080/users/{userId}
	// @RequestMapping("/users/{userId}")
	@GetMapping(value = "/users/{userId}")
	public User getUser(@PathVariable int userId) {
		return service.getUser(userId);
	}

	// POST
	// http://localhost:8080/users
	// @RequestMapping(value = "/users", method = RequestMethod.POST)
	@PostMapping(value = "/users")
	public User insertUser(@RequestBody User user) {
		return service.insertUser(user);
	}

	// http://localhost:8080/users/3 -> DELETE
	@DeleteMapping("/users/{userId}")
	public void deleteUser(@PathVariable int userId) {
		 service.deleteUser(userId);

	}

	@PutMapping("/users/{userId}") // @PatchMapping
	public User updateUser(@PathVariable("userId") int userId, @RequestBody User user) {
		return service.updateUser(userId, user);
	}

}
