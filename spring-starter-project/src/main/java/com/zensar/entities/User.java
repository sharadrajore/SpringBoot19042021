package com.zensar.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Entity
public class User {
	
	@Id
	private int userId;
	
	private String userName;
	
	private int userAge;
	
	private String userEmail;
	
	
	
	

}
