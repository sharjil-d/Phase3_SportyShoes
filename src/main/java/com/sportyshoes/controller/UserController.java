package com.sportyshoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sportyshoes.dto.Adminlogin;
import com.sportyshoes.dto.UserRegistration;
import com.sportyshoes.dto.products;
import com.sportyshoes.service.ValidationServiceImpl;

@Controller
public class UserController {
	@Autowired
	private ValidationServiceImpl validateserviceimpl;
	
	
	@RequestMapping("/home")
	public String getHomePage() {
		return"home";
	}
	
	@RequestMapping("/Userlogin")
	public String getUserLoginpage() {
		return "Userlogin";
	}
	@RequestMapping("/UserRegister")
	public String getUserRegisterpage() {
		return "userregister";
	}
	@RequestMapping("/AdminLogin")
	public String getAdminLoginpage() {
		return "AdminLogin";
	}
	
	@RequestMapping("/validateuser")
		public String Validateuser(@RequestParam String fname,@RequestParam String password) {
		
		
		UserRegistration user=new UserRegistration(fname,password);
		boolean isUserValid=validateserviceimpl.validateUser(user);
		if(isUserValid==true)
			return "userPage";
		else
			return "home";
		
	}
	@RequestMapping("/validateadmin")
	public String Validateadmin(@RequestParam String username,@RequestParam String password) {
	
	
	Adminlogin admin=new Adminlogin(username,password);
	boolean isAdminValid=validateserviceimpl.validateAdmin(admin);
	System.out.println(isAdminValid);
	if(isAdminValid==true)
		return "AdminHome";
	else
		return "home";
	
}
	@RequestMapping("/UserRegisteration")
		public String RegisterUser(@RequestParam String fname,@RequestParam String lname,@RequestParam String email,@RequestParam String password) {
		UserRegistration user=new UserRegistration(fname,lname,email,password);
		boolean isuserregistered=validateserviceimpl.registerUser(user);
		if(isuserregistered==true)
			return "userPage";
		return "home";
		
	}
	@RequestMapping("/ManageProducts")
	public ModelAndView Manageproduct(ModelAndView model) {
		List<products> pp=validateserviceimpl.manageproducts();
		model.addObject("pp",pp);
		model.setViewName("ManageProducts");
		
		return model;
	}
	@RequestMapping("/deleteproduct")
	public String deleteproduct(@RequestParam String producttodelete) {
		int a=Integer.parseInt(producttodelete);
		boolean x=validateserviceimpl.deleteproduct(a);
		return "AdminHome";
		
	}
	@RequestMapping("/SearchUsers")
	public ModelAndView searchusers(ModelAndView model) {
		List<UserRegistration> userss=validateserviceimpl.searchusers();
		model.addObject("userss",userss);
		model.setViewName("ManageUsers");
		
		return model;
	}
	
}
	