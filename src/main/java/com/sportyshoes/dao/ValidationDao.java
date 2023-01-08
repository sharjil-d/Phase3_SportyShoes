package com.sportyshoes.dao;

import java.util.List;

import com.sportyshoes.dto.Adminlogin;
import com.sportyshoes.dto.UserRegistration;
import com.sportyshoes.dto.products;

public interface ValidationDao {
	public boolean registerUser(UserRegistration user);
	public boolean validateAdmin(Adminlogin admin);
	public boolean validateUser(UserRegistration user);
	public List<products> manageproducts();
	public boolean deleteproduct(int num);
	public List<UserRegistration> searchusers();
}
