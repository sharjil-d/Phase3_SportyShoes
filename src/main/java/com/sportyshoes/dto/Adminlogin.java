package com.sportyshoes.dto;

public class Adminlogin {
	private String username;
	private String password;
	@Override
	public String toString() {
		return "Adminlogin [username=" + username + ", password=" + password + "]";
	}
	public Adminlogin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Adminlogin(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	

}
