package com.zensar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.entities.User;
import com.zensar.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository repository;

	@Override
	public List<User> getAllUsers() {
		return repository.getAllUsers();
	}

	@Override
	public User getUser(int userId) {
		return repository.getUser(userId);
	}

	@Override
	public boolean insertUser(User user) {
		return repository.insertUser(user);
	}

	@Override
	public boolean deleteUser(int userId) {
		return repository.deleteUser(userId);
	}

	@Override
	public User updateUser(int userId, User user) {
		return repository.updateUser(userId, user);
	}

}
