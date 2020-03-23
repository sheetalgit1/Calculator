package com.example.caldemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.caldemo.model.User;
import com.example.caldemo.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
    /*
     * API to authenticate a user without using spring security.
     * This is not actually used as we are using spring security.
     * */
	@PostMapping("/api/authenticate/{userName}/{password}")
	public boolean authenticate(@PathVariable("userName") String userName, @PathVariable("password") String password) {
		return userService.authenticate(userName, password);
	}
	
	/*
	 * API to add new user to H2 db
	 * */
	@PostMapping("/api/addUser")
	public User addUser(@RequestBody User user) {
		return userService.addNewUser(user);
	}

}
