package com.zensar.services;

import java.util.List;

import com.zensar.entities.User;

public interface UserService {
	
	public List<User> getAllUsers();
	
	public User getUser( int userId);
	
	public User insertUser( User user);
	
	public void deleteUser( int userId);
	
	public User updateUser( int userId,  User user);

}
