package com.example.ecomsec.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.ecomsec.entity.Admin;
import com.example.ecomsec.repository.AdminRepository;
import com.example.ecomsec.repository.UserRepository;

@Service
public class AdminServiceImple implements AdminService{

	private final AdminRepository adminRepository;
	private final UserRepository userRepository;
	
	public AdminServiceImple(AdminRepository adminRepository,UserRepository userRepository) {
		this.adminRepository=adminRepository;
		this.userRepository=userRepository;
	}
	
	@Override
	public Admin registerAdmin(Admin admin) {
		if(adminRepository.existsByEmail(admin.getEmail())) {
			throw new RuntimeException("Email already Exists");
		}
		return adminRepository.save(admin);
		
	}


	@Override
	public String loginAdmin(String email, String password) {
		// TODO Auto-generated method stub
		if(userRepository.existsByEmail(email)) {
			return "This email belongs to user";
		}
		Optional<Admin> optionalAdmin=adminRepository.findByEmail(email);
		if(optionalAdmin.isEmpty()){
			return "Admin not found";
		}
		Admin dbAdmin=optionalAdmin.get();
		if(!dbAdmin.getPassword().equals(password)) {
			return "Invalid password";
		}
		return "Login Successful";	
	}
}
