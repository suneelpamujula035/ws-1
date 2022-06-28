package com.example.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class TrainerDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String address;
	private String hobbies;
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "trainerDetails")//If we remove mappedBy then it will become bidirectional Mapping
	private Trainer trainer;//if we remove trainer property then it will be one directional mapping
	
	public TrainerDetails() {
		// TODO Auto-generated constructor stub
	}

	public TrainerDetails(String address, String hobbies) {
		super();
		this.address = address;
		this.hobbies = hobbies;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	@Override
	public String toString() {
		return "TrainerDetails [id=" + id + ", address=" + address + ", hobbies=" + hobbies + ", trainer=" + trainer
				+ "]";
	}
	
}
