package com.zensar.repository;

import java.util.List;

import com.zensar.entities.User;

public interface UserRepository {
	
public List<User> getAllUsers();
	
	public User getUser( int userId);
	
	public boolean insertUser( User user);
	
	public boolean deleteUser( int userId);
	
	public User updateUser( int userId,  User user);

}
