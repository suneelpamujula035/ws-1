package com.example.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.example.constants.Gender;

@Entity
@Table(name = "USER_PROFILES")
public class UserProfile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private long id;
	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;
	@Column(name = "ADDRESS")
	private String address;
	@Column(name = "GENDER")
	@Enumerated(EnumType.STRING)
	private Gender gender;
	@Column(name = "DATE_OF_BIRTH")
	private LocalDate dateOfBirth;
	@Temporal(TemporalType.DATE)
	@Column(name = "CREATED_AT")
	private Date createdAt;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private User user;
	
	public UserProfile() {
		// TODO Auto-generated constructor stub
	}

	public UserProfile(String phoneNumber, String address, Gender gender, LocalDate dateOfBirth, Date createdAt,
			User user) {
		super();
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.createdAt = createdAt;
		this.user = user;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
