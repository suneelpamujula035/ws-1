package com.example.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Trainer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String course;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	//@JoinColumn(name = "T_D_FID")
	private TrainerDetails trainerDetails;
	
	public Trainer() {
		// TODO Auto-generated constructor stub
	}

	public Trainer(String name, String course, TrainerDetails trainerDetails) {
		super();
		this.name = name;
		this.course = course;
		this.trainerDetails = trainerDetails;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public TrainerDetails getTrainerDetails() {
		return trainerDetails;
	}

	public void setTrainerDetails(TrainerDetails trainerDetails) {
		this.trainerDetails = trainerDetails;
	}

	@Override
	public String toString() {
		return "Trainer [id=" + id + ", name=" + name + ", course=" + course + ", trainerDetails=" + trainerDetails
				+ "]";
	}
	
}
