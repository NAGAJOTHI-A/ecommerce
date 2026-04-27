package com.example.ecomsec.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.ecomsec.entity.User;
import com.example.ecomsec.service.UserService;

@Controller
@RequestMapping("/api/users")
public class UserController {

	private final UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@PostMapping("/register")
	public User register(@RequestBody User user) {
		return userService.signup(user);
	}
	
	@PostMapping("/login")
	public String login(@RequestBody Map<String,String> data) {
		return userService.signin(data.get("email"), data.get("password"));
		
	}
	
}
