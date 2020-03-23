package com.example.caldemo.service;

import com.example.caldemo.model.User;

public interface UserService {
	/*
	 * API to add new user to H2 db
	 */
	public User addNewUser(User user);
	
	/*
     * API to authenticate a user without using spring security.
     * This is not actually used in this application as we are using spring security.
     * */
	public boolean authenticate(String userName, String password);
}
