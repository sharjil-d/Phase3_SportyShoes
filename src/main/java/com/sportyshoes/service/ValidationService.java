package com.sportyshoes.service;

import java.util.List;

import com.sportyshoes.dto.Adminlogin;
import com.sportyshoes.dto.UserRegistration;
import com.sportyshoes.dto.products;

public interface ValidationService {
	public boolean registerUser(UserRegistration user);
	public boolean validateAdmin(Adminlogin admin);
	public boolean validateUser(UserRegistration user);
	public List<products> manageproducts();
	public boolean deleteproduct(int num);
	public List<UserRegistration> searchusers();

}
