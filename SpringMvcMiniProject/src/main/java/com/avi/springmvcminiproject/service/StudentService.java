package com.avi.springmvcminiproject.service;

import com.avi.springmvcminiproject.entity.Student;
import com.avi.springmvcminiproject.pojo.StudentPOJO;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> findAll();

    Optional<Student> findById(int id);

    Optional<Student> deleteById(int id);

    Student save(StudentPOJO studentPOJO);

    Student update(int id,StudentPOJO studentPOJO);

    List<Student> getStudentByName(String name);
}
