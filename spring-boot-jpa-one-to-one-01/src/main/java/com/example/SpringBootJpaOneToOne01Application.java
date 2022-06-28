package com.example;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.constants.Gender;
import com.example.entity.User;
import com.example.entity.UserProfile;
import com.example.repository.UserProfileRepository;
import com.example.repository.UserRepository;

@SpringBootApplication
public class SpringBootJpaOneToOne01Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaOneToOne01Application.class, args);
	}

	@Autowired
	private UserRepository userRepo;
	@Override
	public void run(String... args) throws Exception {
		
		User user = new User();
		user.setName("Fahim");
		user.setEmail("fahim@gmail.com");
		
		UserProfile userProfile = new UserProfile();
		userProfile.setPhoneNumber("8996543276");
		userProfile.setAddress("Hyderabad");
		userProfile.setGender(Gender.MALE);
		userProfile.setDateOfBirth(LocalDate.of(1998, 8, 29));
		userProfile.setCreatedAt(new Date());
		
		userProfile.setUser(user);
		user.setUserProfile(userProfile);
		
		userRepo.save(user);
	}

}
