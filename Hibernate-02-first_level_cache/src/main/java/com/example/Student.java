package com.example;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENTS_TABLE")
public class Student {

	@Id
	private int id;
	//@Transient//If we don't want to store store particular column data
	private StudentFullName studentFullName;;
	private String address;
	
	public Student() {
	
	}

	public Student(int id, StudentFullName studentFullName, String address) {
		super();
		this.id = id;
		this.studentFullName = studentFullName;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public StudentFullName getStudentFullName() {
		return studentFullName;
	}

	public void setStudentFullName(StudentFullName studentFullName) {
		this.studentFullName = studentFullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", studentFullName=" + studentFullName + ", address=" + address + "]";
	}
}
