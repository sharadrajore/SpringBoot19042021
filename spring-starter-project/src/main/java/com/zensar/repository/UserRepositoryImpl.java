package com.zensar.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.zensar.entities.User;

@Repository
public class UserRepositoryImpl implements UserRepository {
	
	List<User> users = new ArrayList<>();

	public UserRepositoryImpl() {
		users.add(new User(1, "Ram", 30, "ram@gamil.com"));
		users.add(new User(2, "Seeta", 28, "seeta@gamil.com"));
		users.add(new User(3, "Laxman", 26, "laxman@gamil.com"));
	}

	@GetMapping(value = "/users")
	public List<User> getAllUsers() {
		return users;
	}

	// http://localhost:8080/users/{userId}
	// @RequestMapping("/users/{userId}")
	
	public User getUser(@PathVariable int userId) {

		for (User user : users) {
			if (user.getUserId() == userId) {
				return user;
			}

		}

		return null;
	}

	// POST
	// http://localhost:8080/users
	// @RequestMapping(value = "/users", method = RequestMethod.POST)
	
	public boolean insertUser(@RequestBody User user) {
		return users.add(user);
	}

	// http://localhost:8080/users/3 -> DELETE
	
	public boolean deleteUser(@PathVariable int userId) {
		for (User user : users) {
			if (user.getUserId() == userId) {
				return users.remove(user);
			}
		}
		return false;

	}

	
	public User updateUser(@PathVariable("userId") int userId, @RequestBody User user) {
		User user2 = getUser(userId);
		user2.setUserId(userId);
		user2.setUserName(user.getUserName());
		user2.setUserEmail(user.getUserEmail());
		user2.setUserAge(user.getUserAge());
		return user2;
	}
}