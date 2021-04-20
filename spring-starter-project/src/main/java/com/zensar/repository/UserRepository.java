package com.zensar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.entities.User;

public interface UserRepository extends JpaRepository<User,Integer>{
	
}
