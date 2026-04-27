package com.example.ecomsec.service;

import com.example.ecomsec.entity.User;

public interface UserService {

	User signup(User user);
	String signin(String email,String password);
}
