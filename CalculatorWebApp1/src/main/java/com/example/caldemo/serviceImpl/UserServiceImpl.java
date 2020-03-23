package com.example.caldemo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.caldemo.model.User;
import com.example.caldemo.repository.UserRepo;
import com.example.caldemo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public User addNewUser(User user) {
		return userRepo.save(user);
	}

	@Override
	public boolean authenticate(String userName, String password) {
		List<User> userList = userRepo.findByNameAndPassword(userName, password);
		if (userList.isEmpty())
		    return false;
		else
			return true;
	}

	

}
