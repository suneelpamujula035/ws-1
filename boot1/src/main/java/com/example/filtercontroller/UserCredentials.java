package com.example.filtercontroller;

import com.fasterxml.jackson.annotation.JsonIgnore;

//@JsonIgnoreProperties(value = {"username","password"})//We can also use at class level
public class UserCredentials {

	private int id;
	private String username;
	@JsonIgnore
	private String password;
	private String email;
	public UserCredentials() {
		// TODO Auto-generated constructor stub
	}
	public UserCredentials(int id, String username, String password, String email) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "UserCredentials [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email
				+ "]";
	}
	
}
