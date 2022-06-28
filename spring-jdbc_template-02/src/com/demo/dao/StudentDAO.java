package com.demo.dao;

import java.util.List;

import com.demo.api.Student;

public interface StudentDAO {

	public void insert(Student student);
	public void insert(List<Student> student);
	public void cleanUp();
	public List<Student> findAllStudents();
	public Student findStudentById(int id);
	public boolean deleteStudentById(int id);
	public int updateStudentById(Student student);
	public List<Student> findStudentByName(String name);
}
