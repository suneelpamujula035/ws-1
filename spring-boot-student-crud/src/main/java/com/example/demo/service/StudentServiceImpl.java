package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student getStudentByName(String name) {
		Student stu = studentRepository.getStudentByName(name);
		return stu;
	}
	
	
}
