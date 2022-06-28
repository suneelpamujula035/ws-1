package com.example;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entity.Trainer;
import com.example.entity.TrainerDetails;
import com.example.repository.TrainerDetailsRepository;
import com.example.repository.TrainerRepository;

@SpringBootApplication
public class SpringBootJpaOneToOne02Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaOneToOne02Application.class, args);
	}

	@Autowired
	private TrainerRepository trainerRepository;
	@Autowired 
	TrainerDetailsRepository trainerDetailsRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		TrainerDetails td1 = new TrainerDetails("hyderabad", "watching movies");
		TrainerDetails td2 = new TrainerDetails("bangalore", "playing volly ball");
		
		Trainer t1 = new Trainer("santhosh", "java", td1);
		Trainer t2 = new Trainer("vineeth", "spring boot", td2);	
		td1.setTrainer(t1);
		td2.setTrainer(t2);
		
		
		
		trainerRepository.save(t1);
		trainerRepository.save(t2);
	
		
		//trainerRepository.saveAll(Arrays.asList(t1,t2));
	}

}
