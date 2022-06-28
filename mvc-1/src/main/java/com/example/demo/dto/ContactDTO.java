package com.example.demo.dto;

public class ContactDTO {

	private String name;
	private Long number;
	private String email;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getNumber() {
		return number;
	}
	public void setNumber(Long number) {
		this.number = number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "ContactDTO [name=" + name + ", number=" + number + ", email=" + email + "]";
	}
}
