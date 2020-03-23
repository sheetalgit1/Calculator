package com.example.caldemo.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.caldemo.model.User;
import com.example.caldemo.repository.UserRepo;
import com.example.caldemo.security.model.CalcUserDetails;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		Optional<User> user = userRepo.findByUserName(userName);
		user.orElseThrow(()-> new UsernameNotFoundException("Not found user:"+userName));
    	return user.map(CalcUserDetails::new).get();
	}

}
