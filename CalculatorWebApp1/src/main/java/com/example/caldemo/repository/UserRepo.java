package com.example.caldemo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.caldemo.model.User;

public interface UserRepo extends JpaRepository<User, Integer>{

	/*
	 * Method to retrieve user based on given userName and password.
	 * Used to authenticate a user without using spring security
	 */
	@Query("from User where userName=?1 and password=?2")
	List<User> findByNameAndPassword(String userName, String password);
	
	
	/*
	 * Method to retrieve user based on given userName.
	 * Used to authenticate a user using spring security
	 */
	Optional<User> findByUserName(String userName);
}
