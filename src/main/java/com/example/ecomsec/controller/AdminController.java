package com.example.ecomsec.controller;


import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.ecomsec.entity.Admin;
import com.example.ecomsec.service.AdminService;

@RestController
@RequestMapping("/api/admins")
public class AdminController {
  
	
	private final AdminService service;

	public AdminController(AdminService service) {
		super();
		this.service = service;
	}
	
	@PostMapping("/register")
	public Admin register(@RequestBody Admin admin)
	{
		return service.registerAdmin(admin);
	}
	
	@PostMapping("/login")
	public String login(@RequestBody Map<String,String> data)
	{
		return service.loginAdmin(data.get("email"), data.get("password"));
	}
	
}
