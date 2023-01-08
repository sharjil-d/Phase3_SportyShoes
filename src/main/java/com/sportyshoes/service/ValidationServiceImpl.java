package com.sportyshoes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportyshoes.dao.ValidationDao;
import com.sportyshoes.dto.Adminlogin;
import com.sportyshoes.dto.UserRegistration;
import com.sportyshoes.dto.products;

@Service
public class ValidationServiceImpl implements ValidationService {
	
	@Autowired
	ValidationDao dao;
	@Override
	public boolean registerUser(UserRegistration user) {
		return dao.registerUser(user);
	}

	@Override
	public boolean validateAdmin(Adminlogin admin) {
		return dao.validateAdmin(admin);
	}

	@Override
	public boolean validateUser(UserRegistration user) {
		
		return dao.validateUser(user);
	}

	@Override
	public List<products> manageproducts() {
		return dao.manageproducts();
	}

	@Override
	public boolean deleteproduct(int num) {
		return dao.deleteproduct(num);
	}

	@Override
	public List<UserRegistration> searchusers() {
		return dao.searchusers();
	}
	

}
