package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entity.User;
import com.test.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public User findByEmail(String email) {
		System.out.println("findByEmail :" + email);
		return userRepository.findByEmail(email);
	}

	public boolean existsByEmail(String email) {
		return userRepository.existsByEmail(email);
	}
	
}
