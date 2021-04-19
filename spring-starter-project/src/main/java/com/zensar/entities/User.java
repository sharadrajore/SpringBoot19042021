package com.zensar.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class User {
	
	private int userId;
	
	private String userName;
	
	private int userAge;
	
	private String userEmail;
	
	
	
	

}
