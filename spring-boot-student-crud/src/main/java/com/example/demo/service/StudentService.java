package com.example.demo.service;

import com.example.demo.entity.Student;

public interface StudentService {

	public Student saveStudent(Student student);
	public Student getStudentById(long id);
	public Student getStudentByName(String name);
}
