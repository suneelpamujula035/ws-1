package com.example.service;

import com.example.entity.Student;

import java.util.List;

public interface StudentService {

    void saveStudent(Student student);
    List<Student> getAllStudents();
    Student getStudent(long id);
    void updateStudent(Student student);
    void deleteStudent(long id);
    void deleteStudent(Student student);
}
