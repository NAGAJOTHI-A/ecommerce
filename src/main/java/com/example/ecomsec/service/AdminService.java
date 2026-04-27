package com.example.ecomsec.service;

import com.example.ecomsec.entity.Admin;

public interface AdminService {
  
	Admin registerAdmin(Admin admin);
	String loginAdmin(String email,String password);
}
