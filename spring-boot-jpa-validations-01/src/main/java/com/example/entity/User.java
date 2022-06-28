package com.example.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

@Table(name = "users")
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "name", nullable = false)

	// user name should not be null or empty
	// user name should have at least 2 characters
	@NotEmpty
	@Size(min = 2, message = "user name should have at least 2 characters")
	private String name;

	// email should be a valid email format
	// email should not be null or empty
	@NotEmpty
	@Email
	private String email;

	// password should not be null or empty
	// password should have at least 8 characters
	@NotEmpty
	@Size(min = 8, message = "password should have at least 8 characters")
	private String password;
	@Past(message = "Date of birth must be past")
	private LocalDate dateOfBirth;
	@Future(message = "Ticket booked date must be future")
	private LocalDate ticketBookedDate;

	public User() {

	}

	public User(@NotEmpty @Size(min = 2, message = "user name should have at least 2 characters") String name,
			@NotEmpty @Email String email,
			@NotEmpty @Size(min = 8, message = "password should have at least 8 characters") String password,
			@Past(message = "Date of birth must be past") LocalDate dateOfBirth,
			@Future(message = "Ticket booked date must be future") LocalDate ticketBookedDate) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
		this.ticketBookedDate = ticketBookedDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public LocalDate getTicketBookedDate() {
		return ticketBookedDate;
	}

	public void setTicketBookedDate(LocalDate ticketBookedDate) {
		this.ticketBookedDate = ticketBookedDate;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", dateOfBirth="
				+ dateOfBirth + ", ticketBookedDate=" + ticketBookedDate + "]";
	}

	
	
}
