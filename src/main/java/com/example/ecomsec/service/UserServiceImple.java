package com.example.ecomsec.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.ecomsec.entity.User;
import com.example.ecomsec.repository.AdminRepository;
import com.example.ecomsec.repository.UserRepository;

@Service
public class UserServiceImple implements UserService{

	private final UserRepository userRepository;
	private final AdminRepository adminRepository;
	
	
	
	public UserServiceImple(UserRepository userRepository, AdminRepository adminRepository) {
		super();
		this.userRepository = userRepository;
		this.adminRepository = adminRepository;
	}

	@Override
	public User signup(User user) {
		// TODO Auto-generated method stub
		if(userRepository.existsByEmail(user.getEmail())) {
			throw new RuntimeException("Email already exists");
		}
		return userRepository.save(user);
	}

	@Override
	public String signin(String email, String password) {	
		// TODO Auto-generated method stub
		
		if(adminRepository.existsByEmail(email)) {
			return "The email belongs to admin";
		}
		
		Optional<User> optionalUser=userRepository.findByEmail(email);
		if(optionalUser.isEmpty()) {
			return "User not found";
			
		}
		User dbuser=optionalUser.get();
		if(!dbuser.getPassword().equals(password)) {
			return "Invalid password";	
		}
		return "Signin successful";
	}

	
}
