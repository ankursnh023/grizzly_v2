package com.model;

public class Login {
	
	String username;
	String password;
	int status;
	
	
	
	public Login() {
		super();
	}



	public Login(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}



	public int getStatus() {
		return status;
	}



	public void setStatus(int status) {
		this.status = status;
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



	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}

	
	
}
